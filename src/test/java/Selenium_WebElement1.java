import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_WebElement1 {
    @BeforeMethod
            void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //getting the url or navigate to url
        driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");

    }}
    /*@Test
    void findimage()
    {
        //WebElement element = driver.findElement(By.tagName("img"));
       // Assert.assertEquals(true,e);
    }
    @AfterMethod
    void closebrowser()
    {
        driver.close();
    }
}*/
