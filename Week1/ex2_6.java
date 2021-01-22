package Week1;
import utils.TextIO;

public class ex2_6 {
    public static void main(String[] args) {
        System.out.println("Please enter your first name and last name, separated by a space.");
        System.out.print("Enter your name here: ");
        String name = TextIO.getln();
        String firstName, lastName;
        int firstNameCharacters, lastNameCharacters;

        firstName = name.substring(0, name.indexOf(" "));
        lastName = name.substring(name.indexOf(" ") + 1);

        firstNameCharacters = firstName.length();
        lastNameCharacters = lastName.length();

        System.out.println("Your first name is " + firstName + ", which has " + firstNameCharacters +" characters");
        System.out.println("Your last name is " + lastName + ", which has " + lastNameCharacters +" characters");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
    }
}
