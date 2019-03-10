package rtktest.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

import static rtktest.web.Environment.webDriver;

/**
 * Страница оформления заявки
 */
public class RtkOrderPage {
    @FindBy(xpath = "//input[@id='fullName']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='street']")
    public WebElement street;

    @FindBy(xpath ="//input[@id='house']")
    public TextInput house;

    @FindBy(xpath ="//input[@id='apartment']")
    public TextInput apartment;

    @FindBy(xpath ="//input[@name='phoneNumber']")
    public TextInput phone;

    @FindBy(xpath ="//input[@name='email']")
    public TextInput email;

    @FindBy(xpath ="//textarea[@id='comment']")
    public WebElement comment;

    @FindBy(xpath = "//div[text() = 'Настроить']")
    public WebElement collapser;

    @FindBy(xpath ="//button[text() = 'Оформить заявку']")
    public WebElement sendButton;

    public RtkOrderPage() {
        PageFactory.initElements(new HtmlElementDecorator(webDriver), this);
    }

}
