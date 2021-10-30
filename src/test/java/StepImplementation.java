import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;

public class StepImplementation<puclic> extends BaseTest {

    public Click clickButton = new Click();



    @Step("<seconds> saniye bekle")
    public void waitBySecond (int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);

    }
   @Step("Uygulamanin acildigini kontrol et")
    public void isDisplayed() {
       BaseTest.appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/iv_storeBg")).isDisplayed();

   }
   @Step("alisverise basla butonuna tikla.")
    public void buttonClick(){
    clickButton.clickId("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");

   }
   @Step("Alisveris sayfasının acıldığını kontrol et")
    public void alısverisSayfası(){
      appiumDriver.findElement(By.xpath("//*[@text=\"Mağaza\"]")).isDisplayed();

   }

   @Step("Katagoriler butonuna tikla")
    public void katagori(){
        clickButton.clickId("com.ozdilek.ozdilekteyim:id/nav_categories");
   }
   @Step("Katagori sayfasinin acildigini konrol et")
    public void katagoriSayfası(){
        appiumDriver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Kategoriler']")).isDisplayed();

   }
   @Step("Kadin secenegine tikla")
    public void kadin(){
        clickButton.clickXpath("//*[@text=\"Kadın\"]");
   }

   @Step("Pantolon secenegine tikla")
   public void kadinPantolon2(){
        clickButton.clickXpath("//*[@text=\"Pantolon\"]");
   }


   @Step("Scroll et")
   public void ScrollDown() {
       Dimension dimension = appiumDriver.manage().window().getSize();
       int start_x = (int) (dimension.width * 0.5);
       int start_y = (int) (dimension.height * 0.8);

       int end_x = (int) (dimension.width * 0.2);
       int end_y = (int) (dimension.height * 0.2);

       TouchAction touch = new TouchAction(appiumDriver);
       touch.press(PointOption.point(start_x,start_y))
               .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
               .moveTo(PointOption.point(end_x,end_y)).release().perform();
   }

   @Step("Urun sec")
    public void rastgeleUrunSec(){
       List<MobileElement> urunler = (List<MobileElement>)appiumDriver.findElements(By.className("android.widget.FrameLayout"));
       urunler.get(2).click();

   }
   @Step("Urun detay safası acıldı")
    public void urunDetaySayfasiKontrol()
   {
      appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/relLayAddCartBtn"));


   }
   @Step("favoriye tikla")
    public void favoriyeTikla(){
        clickButton.clickId("com.ozdilek.ozdilekteyim:id/imgFav");
   }

    }






