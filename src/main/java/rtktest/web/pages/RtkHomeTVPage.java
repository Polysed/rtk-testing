package rtktest.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

import static rtktest.web.Environment.webDriver;

/**
 * Главная страница
 */

public class RtkHomeTVPage {
    public static final String ORDDER_BUTTON = "//ancestor::div[contains(@class, 'rtk-card__description js-dyn-hcell')]//following-sibling::div[contains(@class, 'rtk-card__actions')]//button";

    @FindBy(xpath = "//h3[text() = 'Стартовый ']"+ORDDER_BUTTON)
    public WebElement orderButtonStart;

    @FindBy(xpath = "//h3[text() = 'Оптимальный ']"+ORDDER_BUTTON)
    public WebElement orderButtonOptimal;

    @FindBy(xpath = "//h3[text() = 'Продвинутый ']"+ORDDER_BUTTON)
    public WebElement orderButtonAdvanced;

    @FindBy(xpath = "//h3[text() = 'Максимальный ']"+ORDDER_BUTTON)
    public WebElement orderButtonMaximal;

    @FindBy(xpath = "//h3[text() = 'КиноViP ']"+ORDDER_BUTTON)
    public WebElement orderButtonCinemaVip;

    @FindBy(xpath = "//h3[text() = 'Для ценителей ']"+ORDDER_BUTTON)
    public WebElement orderButtonForConnoiseurs;

    public RtkHomeTVPage() {
        PageFactory.initElements(new HtmlElementDecorator(webDriver), this);
    }
}


//h3[text() = 'Для семьи ']//ancestor::div[contains(@class, 'rtk-card__description js-dyn-hcell')]//following-sibling::div[contains(@class, 'rtk-card__actions')]//button
//    h3[text() = 'Для впечатлений ']//ancestor::div[contains(@class, 'rtk-card__description js-dyn-hcell')]//following-sibling::div[contains(@class, 'rtk-card__actions')]//button
//
//ancestor::div[contains(@class, 'rtk-card__description js-dyn-hcell')]//following-sibling::div[contains(@class, 'rtk-card__actions')]//button
//.//label[text() = 'Как вас зовут?']//preceding::input


