import java.util.regex.Pattern;

public class UserRegistrationProblem {
    //DECLARE PATTERN
    String firstNamePattern = "^[A-Z][a-z]{2,}$";
    String lastNamePattern = "^[A-Z][a-z]{2,}$";
    String emailId = "^[a-z]+[.]?([-+0-9]*)?([a-z0-9]+)+[@]+(([a-z]{3,5})|([0-9]))+[.]+[a-z]{2,3}+(([.]+[a-z]{2,3})*)$";
    String mobilePattern = "^[0-9]{2}[ ][0-9]{10}$";
    String passwordName = "^[a-zA-Z0-9]{8,}$";
    String passwordUpperCase="^(?=.*[A-Z])[A-Za-z0-9]*.{8,}$";
    String passwordNumber="^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]*.{8,}$";
    String passwordSpecialCharacter="^(?=.*[0-9])(?=.*[~!@#$%^&*().?+])(?=.*[A-Z])[A-Za-z0-9]*.{8,}$";

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
    public boolean validatePasswordName(String passwordRule) {
        return (Pattern.matches(passwordName, passwordRule ));
    }

    //METHOD FOR PASSWORD RULE2
    public boolean validatePasswordUpperCase(String passwordRule) {
        return (Pattern.matches(passwordUpperCase, passwordRule ));
    }

    //METHOD FOR PASSWORD RULE3
    public boolean validatePasswordNumber(String passwordRule) {
        return (Pattern.matches(passwordNumber, passwordRule ));
    }

    //METHOD FOR PASSWORD RULE4
    public boolean validatePasswordSpecialCharacter(String passwordRule) {
        return (Pattern.matches(passwordSpecialCharacter, passwordRule ));
    }
}