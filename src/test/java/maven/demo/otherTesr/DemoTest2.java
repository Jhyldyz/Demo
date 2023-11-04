package maven.demo.otherTesr;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest2 {
    @Test(dataProvider = "provider")
    public void test10(int a, int b, int sum){
//        Assert.assertEquals(a+b, sum);// актуал параметры потом уже что ожидаем

  //      System.out.println(a+b);
//    @Parameters({"hello"})
       // Assert.assertTrue(false); выведет ошибку, дальше не пойдет
    }
    @DataProvider(name = "provider")
    public static Object [][] provideStrAndBoolean(){
        return new Object[][]{
                {10,20, 30}, // пока будут правильные значения будет считываьть
                {1,1, 5},
                {100,5, 105}
        };
    }



//    @Test(dependsOnMethods = "test10")
//    public void test20(){
//        System.out.println("test20");
//    }
}
