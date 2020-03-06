import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {
    UserRegistrationProblem validate = new UserRegistrationProblem();
    String validateEmail[] = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    };
    String invalidateEmail[] = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    };

    //TEST CASE TO CHECK FIRST NAME VALID
    @Test
    public void givenFirstName_whenValid_thenReturn() {
        String fname = "Akshay";
        boolean result = validate.validateFirstName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenInvalid_thenReturn() {
        String fname = "akshay";
        boolean result = validate.validateFirstName(fname);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK LAST NAME VALID
    @Test
    public void givenLastName_whenValid_thenReturn() {
        String fname = "Power";
        boolean result = validate.validateLastName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenInvalid_thenReturn() {
        String fname = "power";
        boolean result = validate.validateLastName(fname);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK EMAIL ID VALID
    @Test
    public void givenEmailId_whenValid_thenReturn() {
        for (int index=0; index<validateEmail.length-1; index++) {
            String email = validateEmail[index];
            boolean result = validate.validateEmailId(email);
            Assert.assertTrue(result);
        }
    }

    //TEST CASE TO CHECK EMAIL ID INVALID
    @Test
    public void givenEmailId_whenInvalid_thenReturn() {
        for (int index=0; index<invalidateEmail.length-1; index++) {
            String email = invalidateEmail[index];
            boolean result = validate.validateEmailId(email);
            Assert.assertFalse(result);
        }
    }

    //TEST CASE TO CHECK VALID MOBILE FORMAT
    @Test
    public void givenMobileNumber_whenValid_thenReturn() {
        String mobile = "91 9919819801";
        boolean result = validate.validateMobileFormat(mobile);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK INVALID MOBILE FORMAT
    @Test
    public void givenMobileNumber_whenInvalid_thenReturn() {
        String mobile = "91991981980";
        boolean result = validate.validateMobileFormat(mobile);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK VALID PASSWORD RULE1
    @Test
    public void givenPasswordRule1_whenValid_thenReturn() {
        String passwordRule = "Bridgelabz1";
        boolean result = validate.validatePasswordRule1(passwordRule);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK INVALID PASSWORD RULE1
    @Test
    public void givenPasswordRule1_whenInvalid_thenReturn() {
        String passwordRule = "bridge";
        boolean result = validate.validatePasswordRule1(passwordRule);
        Assert.assertFalse(result);
    }
}