import org.testng.annotations.*;

public class DemoTest {
@BeforeMethod
public void test(){
    System.out.println("this is before");
    }
    @Test(groups = "groups2")
    public void test1(){
        System.out.println("test1");
    }
    @Test(groups = "groups1")
    public void test2(){
        System.out.println("test2");
    }
    @Test (groups = "groups1")
    public void test5(){
        System.out.println("test3");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
    @AfterMethod
    public void test3(){
        System.out.println("after method");
    }
    @BeforeClass
    public void test4(){
        System.out.println("before class");
    }
    @AfterClass
    public void test6(){
        System.out.println("after class");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }
    @BeforeGroups (groups = "groups1")
    public void beforeGroup(){
        System.out.println("group1");
    }
    @AfterGroups (groups = "groups2")
    public void afterGroup(){
        System.out.println("group2");

        
    }
}
