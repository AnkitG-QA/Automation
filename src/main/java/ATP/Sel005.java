package ATP;

import org.openqa.selenium.edge.EdgeDriver;

public class Sel005
{
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        //driver.get(" http://peter.sh/experiments/chromium-command-line-switches/");
        driver.navigate().to("https://vwo.com/");
        driver.navigate().to("https://peter.sh/experiments/chromium-command-line-switches/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
