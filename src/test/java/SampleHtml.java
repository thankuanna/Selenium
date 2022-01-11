import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleHtml {  

    WebDriver driver;
    @BeforeMethod
    void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/HP/Desktop/JAVA/sample.html");//getting the url
    }

    @Test(enabled = false)
    void verifytable2byid()
    {
        WebElement element = driver.findElement(By.id("table2"));
        Assert.assertTrue(element.isDisplayed());

    }
    @Test
    void verifytable2byname()
    {
        WebElement element = driver.findElement(By.name("value"));
        Assert.assertTrue(element.isDisplayed());

    }
    @Test(enabled = true)
    void verifytable3byclassname()
    {
       WebElement element = driver.findElement(By.className("table3"));
       // WebElement element = driver.findElement(By.xpath("//table[@class=' table3']"));
        Assert.assertTrue(element.isDisplayed());

    }

    @Test(enabled = true)
    void verifytable3byxpath()
    {

        WebElement element = driver.findElement(By.xpath("//table[@class=' table3']"));
        Assert.assertTrue(element.isDisplayed());

    }
    @AfterMethod
    void closebrowser()
    {
        driver.close();
    }
}
