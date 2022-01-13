import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_AssignmentTextEntering {
    WebDriver driver;
    @BeforeMethod
    void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/elements");//getting the url
    }
    @Test
    void textentering()
    {
        driver.navigate().to("https://demoqa.com/text-box");
        WebElement fullname = driver.findElement(By.id("userName"));
        fullname.sendKeys("abcd");
        Assert.assertTrue(fullname.isDisplayed(),"username not found");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("abcd@gmail.com");
        Assert.assertTrue(email.isDisplayed(),"email not found");
        WebElement currentaddr =  driver.findElement(By.id("currentAddress"));
        currentaddr.sendKeys("abcdef");
        Assert.assertTrue(currentaddr.isDisplayed(),"current addr not found");
        WebElement permanentaddr = driver.findElement(By.id("permanentAddress"));
        permanentaddr.sendKeys("abcdefghi");
        Assert.assertTrue(permanentaddr.isDisplayed(),"permanentaddr not found");
       // WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submit']"));///doubt
       // submitbutton.click();
     //   Assert.assertTrue(submitbutton.isDisplayed(),"submit button not found");

        //WebElement afterdisplaying= driver.findElement(By.className("//div[@class='border col-md-12 col-sm-12']"));
      // Assert.assertTrue(afterdisplaying.isDisplayed(),"text after entering is not displayed");



    }
    @AfterMethod
    void closebrowser()
    {

        driver.close();
    }
}
