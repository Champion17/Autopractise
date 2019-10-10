package Contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager
{
    public static WebDriver driver;
    public String url="http://automationpractice.com/index.php";

    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); // path
        driver = new ChromeDriver();
      //  driver.get("url");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public void closeBrowser()
    {
        driver.quit();
    }
}
