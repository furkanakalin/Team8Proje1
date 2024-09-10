package Team8.TC05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC05 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://akakce.com");
        driver.manage().window().maximize();
        MyFunc.Bekle(1);

        WebElement girisYapButton = driver.findElement(By.linkText("Giriş Yap"));
        girisYapButton.click();
        MyFunc.Bekle(1);

        WebElement emailGiris= driver.findElement(By.id("life"));
        emailGiris.sendKeys("technostudyteam8@gmail.com");

        WebElement sifreGiris = driver.findElement(By.id("lifp"));
        sifreGiris.sendKeys("Furkan24");
        MyFunc.Bekle(1);

        WebElement loginButton = driver.findElement(By.id("lfb"));
        loginButton.click();

        MyFunc.Bekle(1);
        driver.quit();
    }
}
