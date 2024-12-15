package ATP;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sel009 {
    @Test
    void testVWOLoginPageTitle ()
    {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        EdgeDriver  driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        //Assert.assertEquals(driver.getTitle(),"Login-VWO");
        driver.getPageSource().equals("atomic");
        driver.close();
    }
}
