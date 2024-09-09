package Team8.TC02;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC02 extends BaseDriver {
    @Test
    public void Test2(){
        driver.navigate().to("https://www.akakce.com/");
        MyFunc.Bekle(1);

        WebElement giris= driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        giris.click();
        MyFunc.Bekle(1);

        WebElement name= driver.findElement(By.xpath("//*[@id='life']"));
        name.sendKeys("technostudyteam8@gmail.com");
        MyFunc.Bekle(1);

        WebElement surname= driver.findElement(By.xpath("//*[@id='lifp']"));
        surname.sendKeys("Furkan24");
        MyFunc.Bekle(1);

        WebElement button= driver.findElement(By.xpath("//*[@id='lfb']"));
        button.click();
        MyFunc.Bekle(1);

        WebElement text=driver.findElement(By.xpath("//*[text()='Team']"));

        Assert.assertTrue("Aranılan kelime bulunamadı", text.getText().contains("Team"));

        BekleKapat();

    }
}
