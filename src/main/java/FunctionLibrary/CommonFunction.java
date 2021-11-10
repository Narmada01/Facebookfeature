package FunctionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class CommonFunction {
    public static WebDriver driver;
    public String filepath= new File("src/test/Properties/config.properties").getAbsolutePath();
    public void openBrowser()
    {
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
    }
    public String readProperty() throws Exception
    {
        FileInputStream inputStream = new FileInputStream(filepath);
        Properties properties= new Properties();
        properties.load(inputStream);
        return properties.getProperty("url");
    }
    public void closeBrowser()
    {
        //driver.quit();
    }
}
