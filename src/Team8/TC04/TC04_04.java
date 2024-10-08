package Team8.TC04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC04_04 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement loginElement = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        loginElement.click();
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//input[@id='life']"));
        email.sendKeys("");

        WebElement password = driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("");

        WebElement submit = driver.findElement(By.xpath("//input[@id='lfb']"));
        submit.click();
        MyFunc.Bekle(2);

        WebElement controlMessage = driver.findElement(By.cssSelector(".alertX > p:nth-child(1)"));
        Assert.assertEquals("Failed", "Lütfen e-posta adresinizi yazın.", controlMessage.getText());
        BekleKapat();
    }
}

