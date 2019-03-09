package rtktest.web;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import rtktest.web.classes.OrderDataClass;
import rtktest.web.classes.TestDataClass;
import rtktest.web.pages.ConfirmationPage;
import rtktest.web.pages.RtkHomeTVPage;
import rtktest.web.pages.RtkOrderPage;

import java.io.IOException;

import static rtktest.web.Utils.scrollIntoElementWithJavaScript;

public class TvOrderTest {

    @Rule
    public RuleForRunWebTest rule = new RuleForRunWebTest();

    @Test
    @Description("Оформление заявки на домашний интернет")
    @Feature("Выбор тарифа")
    public void TvOrderTest() throws IOException {
        RtkHomeTVPage chooseTariff = new RtkHomeTVPage();
        chooseTariff.openPageByUrl();
        // Выберем тариф Продвинутый
        chooseTariff.orderButtonAdvanced.click();
        // Переходим на страницу оформления заявки
       RtkOrderPage orderPage = new RtkOrderPage();
//       Waiters.waitVisibility(webDriver, orderPage.inputFio, "Не дождались появления формы заявки");
//
        orderPage.name.isDisplayed();

        //заполним параметры заявки
        TestDataClass data = new TestDataClass();
        OrderDataClass order = data.makeOrderData();
        Waiters.freezeInMilliSeconds(3000);
        orderPage.name.click();
        orderPage.name.sendKeys(order.getFio());
        orderPage.street.click();
        orderPage.street.sendKeys(order.getStreet());
        Waiters.freezeInMilliSeconds(1000);
        orderPage.house.sendKeys(order.getHouse());
        orderPage.apartment.sendKeys(order.getApartment());
        orderPage.phone.sendKeys(order.getPhone());
        orderPage.email.sendKeys(order.getEmail());
//        Waiters.freezeInMilliSeconds(1000);
        orderPage.comment.getLocation();
        Waiters.freezeInMilliSeconds(2000);
        orderPage.comment.sendKeys(order.getComment());

//        orderPage.inputFio.sendKeys(order.getProperty("fio"));
//        orderPage.inputStreet.sendKeys(order.getProperty("street"));
//        orderPage.inputHouse.sendKeys(order.getProperty("house"));
//        orderPage.inputApartment.sendKeys(order.getProperty("apartment"));
//        orderPage.inputPhone.sendKeys(order.getProperty("phone"));
//        orderPage.inputEmail.sendKeys(order.getProperty("email"));
//        orderPage.comment.sendKeys(order.getProperty("comment"));

        // Отправим заявку на оформление
//        scrollIntoElement(orderPage.collapser);

        orderPage.collapser.click();
        Waiters.freezeInMilliSeconds(1000);
        scrollIntoElementWithJavaScript(orderPage.sendButton);
        orderPage.sendButton.click();
        orderPage.sendButton.click();
        ConfirmationPage successMessage = new ConfirmationPage();
        Assert.assertTrue(successMessage.orderId.isDisplayed());

    }

}
