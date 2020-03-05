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
}