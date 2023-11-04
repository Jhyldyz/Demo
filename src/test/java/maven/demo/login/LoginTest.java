package maven.demo.login;

import maven.demo.otherTesr.BaseTest;
import org.example.settings.clas.ClassSettings;
import org.example.settings.method.MethodSetting;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest1(){
        System.out.println("this is our login test 1");

    }
    @BeforeMethod
    public void beforeMethod(){
        classSettings.classMethod();
        methodSetting = new MethodSetting();
        methodSetting.methodSetting(); //

    }
    @BeforeClass
    public void beforeClass(){
        classSettings=new ClassSettings();
        classSettings.classMethod();
       //  methodSetting.methodSetting(); его иницаилизация после запуска этого класса
    }
}
