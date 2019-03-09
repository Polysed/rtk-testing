package rtktest.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

import static rtktest.web.Environment.webDriver;

/**
*Страница подтверждения заявки
*/
public class ConfirmationPage {

    @FindBy(xpath ="//span[@id = 'order_id']")
    public WebElement orderId;

    public ConfirmationPage() {
        PageFactory.initElements(new HtmlElementDecorator(webDriver), this);
    }

}
