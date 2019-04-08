import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestClass {

@Test
    public void firstTest(){

    BasicTestCase.getWebDriver().get("https://www.bbc.com");
    BasicTestCase.getWebDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    BasicTestCase.getWebDriver().findElement(By.id("orb-search-q")).sendKeys("BBC");
    BasicTestCase.getWebDriver().findElement(By.id( "orb-search-button")).click();
    BasicTestCase.getWebDriver().quit();
}

}
