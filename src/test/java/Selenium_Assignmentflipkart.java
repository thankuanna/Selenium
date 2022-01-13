import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_Assignmentflipkart
{

    WebDriver driver;
    @BeforeMethod
    void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");//getting the url
    }
@Test
void mobile()
{
    driver.navigate().to("https://www.flipkart.com/mobiles/pr?sid=tyy,4io&otracker=categorytree");
    WebElement realme = driver.findElement(By.xpath("//img[contains(@alt,'realme ')]"));
    Assert.assertTrue(realme.isDisplayed(),"realme phones not getting displayed");
}

    @AfterMethod
    void closebrowser()
    {

        driver.close();
    }
}
