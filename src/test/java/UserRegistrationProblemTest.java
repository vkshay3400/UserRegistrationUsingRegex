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
}