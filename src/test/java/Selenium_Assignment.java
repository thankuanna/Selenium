import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_Assignment {
    @Test
    void PageTitle() {
        //opening chrome browser
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //getting the url or navigate to url
        driver.get("https://www.obsqurazone.com/course/javascript");
        driver.manage().window().maximize();

        //Title of the page
        String title_page = driver.getTitle();
        System.out.println("title of the page is" + title_page); //actual

        String expected = "Obsqura Zone Course : JavaScript";

        //verify title
        Assert.assertEquals(title_page, expected, "title not verified");
        driver.close();
    }
@Test
        void CountImage () {
    //opening chrome browser
    System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe"); //using chrome driver&saying the path of chrome driver in s/m
    WebDriver driver = new ChromeDriver(); // creating object of chrome driver

    //getting the url or navigate to url
    driver.get("https://www.obsqurazone.com/course/javascript"); // opening the browser of obsqura in chrome
    driver.manage().window().maximize(); //maximize the page

    //page source
    String page_source = driver.getPageSource();
    System.out.println(page_source);

    /*length of page sourcee
    int length_page_source = driver.getPageSource().length();
    System.out.println("the length of page source = " + length_page_source);*/
//counting images using java code
    int count=0;
String word[] = page_source.split(">");
    for (int i = 0; i< word.length;i++ )
    {
        if(word[i].contains("<img src="))
        {
            count++;
        }

    }
    System.out.println("no of images in the page = " + count);


    driver.close();

}
    }

