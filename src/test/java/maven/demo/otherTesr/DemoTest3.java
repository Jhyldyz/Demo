package maven.demo.otherTesr;

import org.example.settings.global.GlobalSettings;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DemoTest3 {
    @Test(description = "описание теста A")
    public void testA() {
        System.out.println("test A");
    }

    @Test(description = "описание теста B")
    public void testB() {
        System.out.println("test B");

    }

    @Test(description = "описание теста C", priority = 3, enabled = false)
    public void testC() {
        System.out.println("test C");
    }

//    @Test(description = "описание теста D", priority = 4, timeOut = 1)
//    public void testD() throws InterruptedException {
//        Thread.sleep(3000); // zaderjis tut
//        System.out.println("test D");
//    }

    @AfterClass(alwaysRun = false)
    public void testE() {
        System.out.println("test E");
    }

    @Test
    public void testF() {
       String str1= new String("word");
       String str2= new String("word");
       Assert.assertEquals(str1,str2);
       //Assert.assertTrue(str1.equals(str2));
      // Assert.assertFalse(false);
       //Assert.assertSame(str1, str2);

    }
//        Assert.assertEquals("test1", "test1");
//        Assert.assertTrue("test".equals("test"));
//        GlobalSettings actual= new GlobalSettings();
//        GlobalSettings expected= new GlobalSettings(); //2 обьекта  с разными хешкодами
//        String actual= "word";
//        String expected="word";
    // Assert.assertEquals(actual,expected, "obj1 ne raven obj2"); // значения одинаковые
    //Assert.assertTrue(actual==expected); // ссылки разные значения оодинаковые

}

