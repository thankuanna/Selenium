import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class Selenium_AssignmentHtml {

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
    void testbox()
    {
driver.navigate().to("https://demoqa.com/text-box");
        WebElement fullname = driver.findElement(By.id("userName"));
       Assert.assertTrue(fullname.isDisplayed());
        WebElement email = driver.findElement(By.id("userEmail"));
      Assert.assertTrue(email.isDisplayed());
       WebElement element3 =  driver.findElement(By.id("currentAddress"));
       Assert.assertTrue(element3.isDisplayed());
        WebElement currentaddr = driver.findElement(By.id("permanentAddress"));
      Assert.assertTrue(currentaddr.isDisplayed());
        WebElement permanentaddr = driver.findElement(By.id("submit"));
        Assert.assertTrue(permanentaddr.isDisplayed());

    }
@Test
void buttons()
{
    driver.navigate().to("https://demoqa.com/buttons");
    WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
   Assert.assertTrue(doubleclick.isDisplayed());
   WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
   Assert.assertTrue(rightclick.isDisplayed());
    WebElement clickme = driver.findElement(By.xpath("//button[@class ='btn btn-primary']"));
   Assert.assertTrue(clickme.isDisplayed());

}

@Test
void webtables()
{
    driver.navigate().to("https://demoqa.com/webtables");
WebElement table1= driver.findElement(By.xpath("//div[@class='rt-tr-group']"));
Assert.assertTrue(table1.isDisplayed());
    WebElement table2= driver.findElement(By.xpath("//div[@class='rt-tr -even']"));
    Assert.assertTrue(table2.isDisplayed());
    WebElement table3= driver.findElement(By.xpath("//div[@class='rt-tr -odd']"));
    Assert.assertTrue(table3.isDisplayed());

}
@Test
void checknoofrows()
{
    driver.navigate().to("https://demoqa.com/webtables");
    List<WebElement> elements =driver.findElements(By.className("rt-tr-group"));
    Iterator<WebElement> itr =elements.iterator();
    int count = 0;
    while (itr.hasNext())
    {
        String data = itr.next().getText(); // GETTING THE TEXT INSIDE THE row
        if(!data.isEmpty())// doubt not getting no of rows,
        {
            count= count+1;
        }
        else {
            System.out.println("no of rows with data inside the table =" + count);
            break;
        }
    }

}
    @AfterMethod
    void closebrowser()
    {
        driver.close();
    }

}
