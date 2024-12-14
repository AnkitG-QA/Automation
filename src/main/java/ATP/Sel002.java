package ATP;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sel002
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://courses.thetestingacademy.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();

    }

}
