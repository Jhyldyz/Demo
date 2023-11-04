package maven.demo.otherTesr;

import org.example.settings.clas.ClassSettings;
import org.example.settings.global.GlobalSettings;
import org.example.settings.method.MethodSetting;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
    protected GlobalSettings globalSettongs;
    protected ClassSettings classSettings;
    protected MethodSetting methodSetting;
    @BeforeTest
    public void beforeTest(){
        globalSettongs= new GlobalSettings();
        globalSettongs.globalMethod();
    }


}
