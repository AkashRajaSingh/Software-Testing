
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Akash on 10/6/2018.
 */
public class GenWrapper {
    static RemoteWebDriver driver=null;

    public static void startBrowser(String browserName,String url)
    {
        if(browserName.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
            driver.manage().window().maximize();

        }
        if(browserName.equalsIgnoreCase("mozilla"))
        {
            System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(url);
        }
    }
    public static void inputById(String id,String val)
    {
        driver.findElementById(id).sendKeys(val);
    }
    public static void selectById(String id, String val) throws InterruptedException {
        //WebElement webElement = driver.findElement(By.id(id));
        Select dropdown= new Select(driver.findElement(By.id(id)));
        dropdown.selectByValue(val);
        Thread.sleep(500);
    }

    public static void clickById(String id) {
        driver.findElementById(id).click();
    }
    public static void scroll(int x,int y)
    {
        JavascriptExecutor javaScriptExecutor=(JavascriptExecutor) driver;
        javaScriptExecutor.executeScript("window.scrollBy("+x+","+y+")");
    }

    public static void pause(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }
}
