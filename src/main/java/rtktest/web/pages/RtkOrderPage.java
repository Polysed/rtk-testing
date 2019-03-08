package rtktest.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
/**
 * Страница оформления заявки
 */
public class RtkOrderPage {
    @FindBy(xpath =".//label[text() = 'Как вас зовут?']//preceding::input")
    public WebElement inputFio;

    @FindBy(xpath =".//label[text() = 'Контактный телефон']//preceding-sibling::input")
    public WebElement inputPhone;

    @FindBy(xpath =".//label[text() = 'Улица']//preceding-sibling::input")
    public WebElement inputStreet;

    @FindBy(xpath =".//label[text() = 'Дом']//preceding-sibling::input")
    public WebElement inputHouse;

    @FindBy(xpath =".//label[text() = 'Квартира']//preceding-sibling::input")
    public WebElement inputApartment;

    @FindBy(xpath =".//label[text() = 'Электронная почта']//preceding-sibling::input")
    public WebElement inputEmail;

    @FindBy(xpath =".//label[text() = 'Комментарий к заказу']//preceding-sibling::textarea")
    public TextArea textAreaComment;

    //.//div[(@class = 'selectbox form__control_selectbox open')]
//.//div[(@class = 'mx-calendar mx-calendar-panel-date')]
//        .//ul[(@class = 'mx-time-list')]
//    //button[text() = 'OK']


    @FindBy(xpath ="//button[text() = 'Оформить заявку']")
    public WebElement sendButton;


    public String getText(){
        return inputFio.getText();
    }
}
