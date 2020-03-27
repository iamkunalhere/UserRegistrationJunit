package test.java;
import org.junit.Assert;
import org.junit.Test;
import main.java.UserRegistration;
import static org.junit.Assert.*;
public class UserRegistrationTest {
    UserRegistration object=new UserRegistration();
    @Test
    public void name_is_validThenTrue() {
        boolean Name=object.checkName("Name");
        Assert.assertTrue(Name);
    }
    @Test
    public void name_is_invalidThenFalse() {
        boolean Name=object.checkName("name");
        Assert.assertFalse(Name);
    }
    @Test
    public void email_is_validThenTrue() {
        boolean Email=object.checkEmail("iamkunalhere@gmail.com");
        Assert.assertTrue(Email);
    }
}