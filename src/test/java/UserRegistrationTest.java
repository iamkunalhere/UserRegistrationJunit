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
    @Test
    public void mobileNumber_is_validThenTrue() {
        boolean Number=object.checkMobileNumber("91 7276268363");
        Assert.assertTrue(Number);
    }
    @Test
    public void mobileNumber_is_invalidThenFalse() {
        boolean Number=object.checkMobileNumber("1234567890");
        Assert.assertFalse(Number);
    }
    @Test
    public void password_is_validThenTrue() {
        boolean Password=object.checkPassword("g44Ffhsj3242");
        Assert.assertTrue(Password);
    }
    @Test
    public void password_is_invalidThenFalse() {
        boolean Password=object.checkPassword("sf24");
        Assert.assertFalse(Password);
    }
}