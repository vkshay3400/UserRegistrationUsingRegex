import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {

    //TEST CASE TO CHECK FIRST NAME VALID
    @Test
    public void givenFirstName_whenValid_thenReturn(){
        String fname="Akshay";
        UserRegistrationProblem validate=new UserRegistrationProblem();
        boolean result = validate.validateFirstName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenInvalid_thenReturn(){
        String fname="akshay";
        UserRegistrationProblem validate=new UserRegistrationProblem();
        boolean result = validate.invalidateFirstName(fname);
        Assert.assertFalse(result);
    }
}