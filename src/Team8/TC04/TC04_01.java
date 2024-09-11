package Team8.TC04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC04_01 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement loginElement = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        loginElement.click();
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//input[@id='life']"));
        email.sendKeys("technostudyteam8@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Furkan24");

        WebElement submit = driver.findElement(By.xpath("//input[@id='lfb']"));
        submit.click();
        MyFunc.Bekle(2);

        BekleKapat();
    }
}

