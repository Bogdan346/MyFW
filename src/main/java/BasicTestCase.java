import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicTestCase {

    public static WebDriver driver;



    public    static WebDriver getWebDriver(){
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }


    @After
    public void close(){
        driver.quit();
    }

}
