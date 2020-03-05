import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public String firstNamePattern="^[A-Z][a-z]{2,}$";
    public boolean validateFirstName(String firstName){
        return (Pattern.matches(firstNamePattern,firstName));
    }
    public boolean invalidateFirstName(String firstName){
        return (Pattern.matches(firstNamePattern,firstName));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to user registration problem");
    }
}