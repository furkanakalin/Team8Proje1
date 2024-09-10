package Team8.TC07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC07  extends BaseDriver {
    @Test
    public void Test(){
        // Here we login the into the page and
        // try to delete the profile.
        // But we use wrong password and click on the
        // submit button
        // there should be message that the account
        // cannot be deleted according to the wrong password.
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);
        WebElement loginElement = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        loginElement.click();
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.xpath("//input[@id='life']"));
        email.sendKeys("technostudyteam8@gmail.com");
        MyFunc.Bekle(2);
        WebElement password= driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Furkan24");
        MyFunc.Bekle(2);
        WebElement submit=driver.findElement(By.xpath("//input[@id='lfb']"));
        submit.click();
        MyFunc.Bekle(2);

        WebElement hesabim=driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        hesabim.click();
        MyFunc.Bekle(2);
        WebElement hesabim2=driver.findElement(By.xpath("//a[@href='/akakcem/']"));
        hesabim2.click();
        MyFunc.Bekle(2);

        WebElement hesabimiSil= driver.findElement(By.xpath("//a[@href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        hesabimiSil.click();
        MyFunc.Bekle(2);
        WebElement password2= driver.findElement(By.xpath("//input[@id='p']"));
        password2.sendKeys("Realmadrid");
        MyFunc.Bekle(2);
        WebElement submit2= driver.findElement(By.xpath("//input[@id='u']"));
        submit2.click();
        MyFunc.Bekle(2);
        // Process failed message
        WebElement message= driver.findElement(By.cssSelector(".alertX > p:nth-child(1)"));

        Assert.assertTrue("Test Failed", message.getText().contains("Mevcut şifrenizi doğru girdiğinizden emin olun."));


        BekleKapat();



    }
}
