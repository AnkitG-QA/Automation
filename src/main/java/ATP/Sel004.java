package ATP;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Sel004
{
    public static void main(String[] args) {
       // EdgeOptions edgeOptions=new EdgeOptions();
       // edgeOptions.addExtensions("");

        EdgeDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(" http://peter.sh/experiments/chromium-command-line-switches/");
        //driver.close();
        driver.quit();

    }
}
