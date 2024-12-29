package ATP;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Sel015 {
    @Test
    void Login12() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("augtest_040823@idrive.com");

        WebElement password_input_xpath = driver.findElement(By.xpath("//input[@id='password']"));
        password_input_xpath.sendKeys("123456");

        WebElement span_checkbox = driver.findElement(By.className("id-checkmark"));
        span_checkbox.click();

        WebElement button_submit = driver.findElement(By.cssSelector("div.id-frm-btnblk > button"));
        button_submit.click();
        Thread.sleep(20000);
        WebElement Text_Message=driver.findElement(By.xpath("//h5[text()= \"Your free trial has expired\"]"));
        Assert.assertEquals(Text_Message.getText(),"Your free trial has expired");
        driver.quit();
    }
}
