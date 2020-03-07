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
    public void givenFirstName_WhenValid_ThenReturnTrue() {
        String name = "Akshay";
        boolean result = validate.validateFirstName(name);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_WhenInvalid_ThenReturnFalse() {
        String name = "akshay";
        boolean result = validate.validateFirstName(name);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK MINIMUM THREE FIRST NAME CHARACTER VALID
    @Test
    public void givenFirstName_MinimumThreeCharacterWhenValid_ThenReturnTrue() {
        String name = "Akshay";
        boolean result = validate.validateFirstName(name);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK MINIMUM THREE FIRST NAME CHARACTER INVALID
    @Test
    public void givenFirstName_MinimumThreeCharacterWhenInvalid_ThenReturnTrue() {
        String name = "ak";
        boolean result = validate.validateFirstName(name);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK LAST NAME VALID
    @Test
    public void givenLastName_WhenValid_ThenReturnTrue() {
        String name = "Power";
        boolean result = validate.validateLastName(name);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_WhenInvalid_ThenReturnFalse() {
        String name = "power";
        boolean result = validate.validateLastName(name);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK MINIMUM THREE LAST NAME CHARACTER VALID
    @Test
    public void givenLastName_MinimumThreeCharacterWhenValid_ThenReturnTrue() {
        String name = "Power";
        boolean result = validate.validateFirstName(name);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK MINIMUM THREE LAST NAME CHARACTER INVALID
    @Test
    public void givenLastName_MinimumThreeCharacterWhenInvalid_ThenReturnTrue() {
        String name = "Po";
        boolean result = validate.validateFirstName(name);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK EMAIL ID VALID
    @Test
    public void givenEmailId_WhenValid_ThenReturnTrue() {
        for (int index=0; index<validateEmail.length-1; index++) {
            String email = validateEmail[index];
            boolean result = validate.validateEmailId(email);
            Assert.assertTrue(result);
        }
    }

    //TEST CASE TO CHECK EMAIL ID INVALID
    @Test
    public void givenEmailId_WhenInvalid_ThenReturnFalse() {
        for (int index=0; index<invalidateEmail.length-1; index++) {
            String email = invalidateEmail[index];
            boolean result = validate.validateEmailId(email);
            Assert.assertFalse(result);
        }
    }

    //TEST CASE TO CHECK VALID MOBILE FORMAT
    @Test
    public void givenMobileNumber_WhenValid_ThenReturnTrue() {
        String mobile = "91 9919819801";
        boolean result = validate.validateMobileFormat(mobile);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK INVALID MOBILE FORMAT
    @Test
    public void givenMobileNumber_WhenInvalid_ThenReturnFalse() {
        String mobile = "91991981980";
        boolean result = validate.validateMobileFormat(mobile);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK VALID PASSWORD RULE1
    @Test
    public void givenPasswordName_WhenValid_ThenReturnTrue() {
        String passwordRule = "Bridgelabz1";
        boolean result = validate.validatePasswordName(passwordRule);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK INVALID PASSWORD RULE1
    @Test
    public void givenPasswordName_WhenInvalid_ThenReturnFalse() {
        String passwordRule = "bridge";
        boolean result = validate.validatePasswordName(passwordRule);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK VALID PASSWORD RULE2
    @Test
    public void givenPasswordUpperCase_WhenValid_ThenReturnTrue() {
        String passwordRule = "bridgelabZ";
        boolean result = validate.validatePasswordUpperCase(passwordRule);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK INVALID PASSWORD RULE2
    @Test
    public void givenPasswordUpperCase_WhenInvalid_ThenReturnFalse() {
        String passwordRule = "bridge";
        boolean result = validate.validatePasswordUpperCase(passwordRule);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK VALID PASSWORD RULE3
    @Test
    public void givenPasswordNumber_WhenValid_ThenReturnTrue() {
        String passwordRule = "bridgelabZ1";
        boolean result = validate.validatePasswordNumber(passwordRule);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK INVALID PASSWORD RULE3
    @Test
    public void givenPasswordNumber_WhenInvalid_ThenReturnFalse() {
        String passwordRule = "bridgelab";
        boolean result = validate.validatePasswordNumber(passwordRule);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK VALID PASSWORD RULE4
    @Test
    public void givenPasswordSpecialCharacter_WhenValid_ThenReturnTrue() {
        String passwordRule = "bridgelabZ1%";
        boolean result = validate.validatePasswordSpecialCharacter(passwordRule);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK INVALID PASSWORD RULE4
    @Test
    public void givenPasswordSpecialCharacter_WhenInvalid_ThenReturnFalse() {
        String passwordRule = "bridgelab";
        boolean result = validate.validatePasswordSpecialCharacter(passwordRule);
        Assert.assertFalse(result);
    }
}