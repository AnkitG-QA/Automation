package FileIO;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class File001
{
    @Test
    void firstFile() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        String URL="https://example.com/download-page";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        String File_name="MyFile.csv";
        String Path =System.getProperty("user.dir")+"//AutomationProject//";
        File f =new File(Path+File_name);
        try {
            if (f.createNewFile())
            {
                System.out.println("File Created Suceessfully"+f.getName());
            }
            else
            {
                System.out.println("File Already Exist");
            }
            }
            catch(IOException e)
            {
                System.out.println("File is Not Created");
            }

}}

