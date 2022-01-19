import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.html.HTMLDocument;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium_AssignmentBuffalocart_2
{
    WebDriver driver;
    @BeforeMethod
    void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //old implicit
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //new implicit wait
        //driver.manage().timeouts().setScriptTimeout()
        driver.manage().window().maximize();
        driver.get("http://buffalocart.com/demo/crm/");//getting the ur
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
    }
     @Test
    void client() throws InterruptedException {
         WebElement client_LINK = driver.findElement(By.xpath("//span[text()='Clients']//parent::a"));
         client_LINK.click();

         List<WebElement> oddrow = driver.findElements(By.xpath("//tr[@class='odd']//td[2]"));
         List<WebElement> evenrow = driver.findElements(By.xpath("//tr[@class='even']//td[2]"));

         List<WebElement> company = driver.findElements(By.xpath("//table[@id='client-table']/tbody/tr//td[2]"));
        for (int i=0;i< company.size();i++)
        {
            System.out.println(company.get(i).getText());
        }
     }

    
    @AfterMethod
    void closebrowser()
    {

        driver.close();
    }
       /*String title = driver.getTitle();
       Assert.assertEquals(title,"Clients | Demo- Project Manager");
       driver.navigate().to("http://buffalocart.com/demo/crm/index.php/clients");
       List<WebElement> companyname = driver.findElements(By.xpath("//table[@id='client-table']/tbody/tr//td[2]"));
       for (WebElement element : companyname)
       {
           String data = element.getText();
           System.out.println(data);
       }
        //capture text

    }*/

   /* @Test
    void overview()
    {
        WebElement client = driver.findElement(By.xpath("//span[text()='Clients']//parent::a"));
        client.click();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Clients | Demo- Project Manager");
        WebElement overview = driver.findElement(By.xpath("//a[@href='javascript:;']"));
        Assert.assertTrue(overview.isDisplayed(),"overview button not found");
        overview.click();







    }*/

}
