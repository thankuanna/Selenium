import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_AssignmentBuffalocart 
{
    WebDriver driver;
    @BeforeMethod
    void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://buffalocart.com/demo/crm/");//getting the url
    }
     @Test
    void buffalocart()
    {
        driver.navigate().to("http://buffalocart.com/demo/crm/index.php/signin");
        WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
        Assert.assertTrue(email.isDisplayed(),"email not found");
        email.sendKeys("admin@admin.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        Assert.assertTrue(password.isDisplayed(),"password not found");
        password.sendKeys("123456");
        WebElement signin =driver.findElement(By.xpath("//button[@type='submit']"));
        Assert.assertTrue(signin.isDisplayed(),"signin button not found");
        signin.click();
        WebElement companyname = driver.findElement(By.xpath(" //img[@class='dashboard-image']"));
        Assert.assertTrue(companyname.isDisplayed(),"company name not present");
        WebElement user_name = driver.findElement(By.id("user-dropdown"));
        Assert.assertTrue(user_name.isDisplayed(),"username is not displayed");
    }
    @AfterMethod
    void closebrowser()
    {

        driver.close();
    }
}
