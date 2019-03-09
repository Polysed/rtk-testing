package rtktest.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

import static rtktest.web.Environment.webDriver;
//import rtktest.web.classes.OrderDataClass;

/**
 * Страница оформления заявки
 */
public class RtkOrderPage {
    @FindBy(xpath = "//input[@id='fullName']")
    public WebElement name;

//    @FindBy(xpath =".//label[text() = 'Как вас зовут?']//preceding::input")
//    public WebElement inputFio;

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

//    @Step("Заполняем поля заявки: ФИО = {inputFio} Улица = {inputStreet} Дом = {inputHouse} " +
//            "Квартира = {inputApartment} Телефон = {inputPhone} ЭлПочта =  {inputEmail} Комментарий = {textAreaComment}")
//    public void fillOrderForm(OrderDataClass data) {
//        this.inputFio.sendKeys((CharSequence) data.getFio());
//        this.inputStreet.sendKeys((CharSequence) data.getStreet());
//        this.inputHouse.sendKeys((CharSequence) data.getHouse());
//        this.inputApartment.sendKeys((CharSequence) data.getApartment());
//        this.inputPhone.sendKeys((CharSequence) data.getPhone());
//        this.inputEmail.sendKeys((CharSequence) data.getEmail());
//        this.comment.sendKeys((CharSequence) data.getComment());
//
//        Waiters.freezeInMilliSeconds(1000);
//    }
        //
//    @FindBy(xpath = "//div[@class = 'selectbox__wrap']//child::div[text() = 'В ближайшее время']")
//    public WebElement usefulTimeField;
//
//    @FindBy(xpath = "//div[(@class = 'selectbox form__control_selectbox open')]//child::div[@class = 'selectbox__list-options']")
//    public Select timeList;
//
//    @FindBy(xpath = "//input[contains(@placeholder, 'Выберите дату')]")
//    public WebElement chooseDate;
//
//    @FindBy(xpath = ".//div[(@class = 'mx-calendar mx-calendar-panel-date')]")
//    public CalendarData calendar;
//
//    @FindBy(xpath = ".//ul[(@class = 'mx-time-list')]")
//    public Select calendarTime;
//
//    @FindBy(xpath = "//button[text() = 'OK']")
//    public Button buttonOk;

    //div[contains(@class, 'rtk-collapser__title rt-font-h3 rt-font-bold') and text() = 'Настроить']
    //div[text() = 'Настроить']
}
