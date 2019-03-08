package rtktest.web.pages;

import io.qameta.allure.Step;
import org.hamcrest.text.pattern.Parse;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rtktest.web.Waiters;
import ru.yandex.qatools.htmlelements.element.Select;
import sun.util.resources.cldr.CalendarData;

import java.awt.*;
import java.text.spi.DateFormatProvider;
import java.util.ArrayList;

/**
 * Страница оформления заявки
 */
public class RtkOrderPage {
    @FindBy(xpath =".//label[text() = 'Как вас зовут?']//preceding::input")
    public WebElement inputFio;

    @FindBy(xpath =".//label[text() = 'Улица']//preceding-sibling::input")
    public WebElement inputStreet;

    @FindBy(xpath =".//label[text() = 'Дом']//preceding-sibling::input")
    public WebElement inputHouse;

    @FindBy(xpath =".//label[text() = 'Квартира']//preceding-sibling::input")
    public WebElement inputApartment;

    @FindBy(xpath =".//label[text() = 'Контактный телефон']//preceding-sibling::input")
    public WebElement inputPhone;

    @FindBy(xpath =".//label[text() = 'Электронная почта']//preceding-sibling::input")
    public WebElement inputEmail;

    @FindBy(xpath =".//label[text() = 'Комментарий к заказу']//preceding-sibling::textarea")
    public WebElement comment;

    @FindBy(xpath = "//div[@class = 'selectbox__wrap']//child::div[text() = 'В ближайшее время']")
    public WebElement usefulTimeField;

    @FindBy(xpath = "//div[(@class = 'selectbox form__control_selectbox open')]//child::div[@class = 'selectbox__list-options']")
    public Select timeList;

    @FindBy(xpath = "//input[contains(@placeholder, 'Выберите дату')]")
    public WebElement chooseDate;

    @FindBy(xpath = ".//div[(@class = 'mx-calendar mx-calendar-panel-date')]")
    public CalendarData calendar;

    @FindBy(xpath = ".//ul[(@class = 'mx-time-list')]")
    public Select calendarTime;

    @FindBy(xpath = "//button[text() = 'OK']")
    public Button buttonOk;

//input[contains(@placeholder, 'Выберите дату')]
//.//div[(@class = 'mx-calendar mx-calendar-panel-date')]
//        .//ul[(@class = 'mx-time-list')]
//    //button[text() = 'OK']

    //*[@id="stepPersonalData"]/div/div[2]/div/div/div/div[6]/div[2]/div/div/label/div/div[1]/input

    @FindBy(xpath ="//button[text() = 'Оформить заявку']")
    public WebElement sendButton;


    @Step("Заполняем поля заявки: ФИО = {inputFio} Улица = {inputStreet} Дом = {inputHouse} " +
            "Квартира = {inputApartment} Телефон = {inputPhone} ЭлПочта =  {inputEmail} Комментарий = {textAreaComment}")
    public void fillOrderForm(TestData data) {
        this.inputFio.sendKeys((CharSequence) data.getFio());
        this.inputStreet.sendKeys((CharSequence) data.getStreet());
        this.inputHouse.sendKeys((CharSequence) data.getHouse());
        this.inputApartment.sendKeys((CharSequence) data.getApartment());
        this.inputPhone.sendKeys((CharSequence) data.getPhone());
        this.inputEmail.sendKeys((CharSequence) data.getEmail());
        this.comment.sendKeys((CharSequence) data.getComment());


//        scrollIntoElement(this..getWrappedElement());
//        this.mobileNumber.getInput().clear();
//        this.mobileNumber.getInput().sendKeys(number);
//        Waiters.freezeInMilliSeconds(1000);
//
//        this.paymentSelect.selectByTitle(accountTitle);
//        Waiters.freezeInMilliSeconds(1000);
//
//        scrollIntoElement(this.paymentSumm.getWrappedElement());
//        this.paymentSumm.getInput().sendKeys(summ);
//        Waiters.freezeInMilliSeconds(1000);
//    }
//    @Step("Заполняем поля формы: Оператор = {operator}")
//    public void fillForm(String operator, String number, String accountTitle, String summ) {
//        this.operatorSelect.selectByValue(operator);
//        Waiters.freezeInMilliSeconds(2000);
//
//        fillFormWoOperator(number, accountTitle, summ);
    }
}
