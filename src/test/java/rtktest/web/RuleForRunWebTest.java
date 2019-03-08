package rtktest.web;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.chrome.ChromeDriver;

import static rtktest.web.Environment.webDriver;
import static rtktest.web.Utils.makeScreenshoot;

public class RuleForRunWebTest implements TestRule {

    @Override
    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                startWebDriver();
                try {
                    base.evaluate();
                }
                finally {
                    makeScreenshoot();
                    killWebDriver();
                }
            }
        };
    }

    private void startWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    private void killWebDriver() {
        webDriver.quit();
    }
}
