package ATP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sel001
{
    public static void main(String[] args) throws InterruptedException {
       // WebDriver driver=new ChromeDriver();
        WebDriver driver1=new EdgeDriver();
        driver1.get("https://app.vwo.com/#/login");
        driver1.manage().window().maximize();
        Thread.sleep(4000);
        driver1.findElement(By.xpath(" //input[@id='login-username']")).sendKeys("gangurdeankit19@gmail.com");
        driver1.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Robi@123");
        driver1.findElement(By.xpath("//button[@id='js-login-btn']")).click();
    }
}
