import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {
    UserRegistrationProblem validate=new UserRegistrationProblem();
    //TEST CASE TO CHECK FIRST NAME VALID
    @Test
    public void givenFirstName_whenValid_thenReturn(){
        String fname="Akshay";
        boolean result = validate.validateFirstName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenInvalid_thenReturn(){
        String fname="akshay";
        boolean result = validate.validateFirstName(fname);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK LAST NAME VALID
    @Test
    public void givenLastName_whenValid_thenReturn(){
        String fname="Power";
        boolean result = validate.validateLastName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenInvalid_thenReturn(){
        String fname="power";
        boolean result = validate.validateLastName(fname);
        Assert.assertFalse(result);
    }
}