package rtktest.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

import static rtktest.web.Environment.webDriver;

/**
 * Главная страница
 */

public class RtkPackagesPage {
    @FindBy(xpath = "//h3[text() = 'Для впечатлений ']//ancestor::div[contains(@class, 'rtk-card__description js-dyn-hcell')]//following-sibling::div[contains(@class, 'rtk-card__actions')]//button")
    public WebElement orderButtonForImpression;

    @FindBy(xpath = "//h3[text() = 'Для семьи ']//ancestor::div[contains(@class, 'rtk-card__description js-dyn-hcell')]//following-sibling::div[contains(@class, 'rtk-card__actions')]//button")
    public WebElement orderButtonForFamily;


//h3[text() = 'Для семьи ']//ancestor::div[contains(@class, 'rtk-card__description js-dyn-hcell')]//following-sibling::div[contains(@class, 'rtk-card__actions')]//button
    //h3[text() = 'Для впечатлений ']//ancestor::div[contains(@class, 'rtk-card__description js-dyn-hcell')]//following-sibling::div[contains(@class, 'rtk-card__actions')]//button


}
