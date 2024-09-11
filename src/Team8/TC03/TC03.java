package Team8.TC03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC03 extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://www.akakce.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(2);

        WebElement giris = driver.findElement(By.xpath("//*[@id='H_rl_v8']/*[2]"));
        giris.click();
        MyFunc.Bekle(2);

        WebElement eposta = driver.findElement(By.xpath("//*[@id='life']"));
        eposta.sendKeys("technostudyteam8@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//*[@id='lifp']"));
        password.sendKeys("Furkan24");
        MyFunc.Bekle(2);

        WebElement login = driver.findElement(By.xpath("//*[@id='lfb']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement profile = driver.findElement(By.xpath("//*[@id='H_a_v8']"));
        profile.click();
        MyFunc.Bekle(2);

        WebElement cik = driver.findElement(By.xpath("//*[text()='Çık']"));
        cik.click();
        MyFunc.Bekle(2);

        WebElement giriss = driver.findElement(By.xpath("//*[@id='H_rl_v8']/*[2]"));
        giriss.click();

        BekleKapat();
    }
}
