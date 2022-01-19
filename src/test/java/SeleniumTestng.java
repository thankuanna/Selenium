import org.testng.annotations.*;

public class SeleniumTestng {

    @BeforeClass
    void bc()
    {

        System.out.println("Test Before Class");
    }
    @BeforeMethod
    void bm()
    {

        System.out.println("test before METHOD");
    }
    @BeforeTest
    void bt()
    {
        System.out.println("test beforeTEST");
    }
    @AfterTest
    void at()
    {

        System.out.println("test after TEST");
    }
    @BeforeSuite
    void bs()
    {

        System.out.println("test before suite");
    }
    @AfterSuite
    void as()
    {

        System.out.println("test after SUITE");
    }
    @Test
    void test1()
    {

        System.out.println("Test1......");
    }

    @Test
    void test2()
    {

        System.out.println("Test2.......");
    }

    @AfterMethod
    void am()
    {

        System.out.println("test after METHOD");
    }
    @AfterClass
    void ac()
    {

        System.out.println("test after CLASS");
    }
}
