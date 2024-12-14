package ATP;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Sel003
{
    public static void main(String[] args) {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        EdgeDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://courses.thetestingacademy.com/");

//        ChromeOptions chromeOptions=new ChromeOptions();
//        chromeOptions.addArguments("--start-maximized");
//        ChromeDriver driver=new ChromeDriver(chromeOptions);
//        driver.get("https://courses.thetestingacademy.com/");

    }
}
