package Team8.TC05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC05 extends BaseDriver {

        @Test
        public void Test () {
        driver.get("https://akakce.com");
        driver.manage().window().maximize();
        MyFunc.Bekle(2);

        WebElement girisYapButton = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        girisYapButton.click();
        MyFunc.Bekle(2);

        WebElement emailGiris= driver.findElement(By.xpath("//input[@id='life']"));
        emailGiris.sendKeys("technostudyteam8@gmail.com");
        MyFunc.Bekle(2);

        WebElement sifreGiris= driver.findElement(By.xpath("//input[@id='lifp']"));
        sifreGiris.sendKeys("Furkan24");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='lfb']"));
        loginButton.click();
        MyFunc.Bekle(2);

        WebElement hesabimButton = driver.findElement(By.cssSelector("#HM_v8 > i:nth-child(1) > a:nth-child(1)"));
        hesabimButton.click();

        MyFunc.Bekle(2);

        WebElement siparislerimLink = driver.findElement(By.linkText("Siparişlerim"));
        siparislerimLink.click();

        MyFunc.Bekle(3);
        driver.quit();
    }
}
