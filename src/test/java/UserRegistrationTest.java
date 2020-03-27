package test.java;
import org.junit.Assert;
import org.junit.Test;
import main.java.UserRegistration;
import static org.junit.Assert.*;

public class UserRegistrationTest {
    UserRegistration object=new UserRegistration();
    @Test
    public void firstName_is_validThenTrue(){
        boolean firstName=object.checkName("Name");
        Assert.assertTrue(firstName);
    }
    @Test
    public void firstName_is_invalidThenFalse(){
        boolean firstName=object.checkName("name");
        Assert.assertFalse(firstName);
    }

}