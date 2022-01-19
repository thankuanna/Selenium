import org.testng.annotations.*;

public class TestngAnnotations_1 {
    @BeforeClass
    void beforeclass()
    {
        System.out.println("this is the test before class ");
    }
    @BeforeTest
    void bt()
    {
        System.out.println("this is the test before test ");
    }
    @BeforeMethod
    void bm()
    {
        System.out.println("This is test before method");
    }
    @BeforeSuite
    void bs()
    {
        System.out.println("this is the test before suite ");
    }

    @Test(priority = 0)
    void test2()
    {
        System.out.println("Test2....");
    }
    @Test(priority = 1)
    void test1()
    {
        System.out.println("Test1......");
    }

    @Test(enabled = false)
    void test3()
    {
        System.out.println("test3.....");
    }
    @AfterMethod
    void am()
    {
        System.out.println("this is the test after method ");
    }
    @AfterClass
    void  afterclass()
    {
        System.out.println("this is the test after class ");
    }
    @AfterTest
    void at()
    {
        System.out.println("this is the test after test ");
    }
    @AfterSuite
    void as()
    {
        System.out.println("this is the test after suite ");
    }
}
