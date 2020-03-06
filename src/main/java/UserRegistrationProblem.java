import java.util.regex.Pattern;

public class UserRegistrationProblem {
    //DECLARE PATTERN
    String firstNamePattern = "^[A-Z][a-z]{2,}$";
    String lastNamePattern = "^[A-Z][a-z]{2,}$";
    String emailId = "^[a-z]+[.]?([-+0-9]*)?([a-z0-9]+)+[@]+(([a-z]{3,5})|([0-9]))+[.]+[a-z]{2,3}+(([.]+[a-z]{2,3})*)$";
    String mobilePattern = "^[0-9]{2}[ ][0-9]{10}$";
    String passwordRule1 = "^[a-zA-Z0-9]{8,}$";
    String passwordRule2="^(?=.*[A-Z])[A-Za-z0-9]{8,}$";
    String passwordRule3="^(?=.*[0-9])[A-Za-z0-9]{8,}$";

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("Welcome to user registration problem");
    }

    //METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern, firstName));
    }

    //METHOD TO VALIDATE LAST NAME
    public boolean validateLastName(String lastName) {
        return (Pattern.matches(lastNamePattern, lastName));
    }

    //METHOD FOR EMAIL ID
    public boolean validateEmailId(String email) {
        return (Pattern.matches(emailId, email));
    }

    //METHOD FOR MOBILE FORMAT
    public boolean validateMobileFormat(String mobile) {
        return (Pattern.matches(mobilePattern, mobile));
    }

    //METHOD FOR PASSWORD RULE1
    public boolean validatePasswordRule1(String passwordRule) {
        return (Pattern.matches(passwordRule1, passwordRule ));
    }

    //METHOD FOR PASSWORD RULE2
    public boolean validatePasswordRule2(String passwordRule) {
        return (Pattern.matches(passwordRule2, passwordRule ));
    }

    //METHOD FOR PASSWORD RULE3
    public boolean validatePasswordRule3(String passwordRule) {
        return (Pattern.matches(passwordRule3, passwordRule ));
    }
}