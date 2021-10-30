import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class Click extends BaseTest {

    public void clickXpath(String xpath) {
       MobileElement driver = appiumDriver.findElement(By.xpath(xpath));
        driver.click();

    }

    public void clickClass (String className) {
        MobileElement driver = appiumDriver.findElement(By.className(className));
        driver.click();
    }

    public void clickId (String id) {
        MobileElement driver = appiumDriver.findElement(By.id(id));
        driver.click();
    }

}
