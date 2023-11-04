package maven.demo.otherTesr;

import org.example.settings.clas.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {
    Person tanos= new Person("tanos", 18, "imanaliev");
    Person ruslan= new Person("Ruslan", 33, "imanaliev");

    @Test
    public void testPerson(){
        ruslan.setName("Aibike");
        Assert.assertEquals(ruslan.getName(),"Aibike");

    }
    @Test
    public void checkLastName(){

        Assert.assertSame(ruslan.getLastName(), tanos.getLastName());
        System.out.println("test proshel");
    }
}
