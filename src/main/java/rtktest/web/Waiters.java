package rtktest.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {

    public static long timeoutInSeconds = 30;

    public static void freezeInMilliSeconds(long milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void waitVisibility(WebDriver webDriver, WebElement element, String message) {
        new WebDriverWait(webDriver, timeoutInSeconds)
                .withMessage(message).until(ExpectedConditions
                .visibilityOf(element));
    }
}
