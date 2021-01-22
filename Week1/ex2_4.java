package Week1;
import utils.TextIO;

public class ex2_4 {
    public static void main(String[] args) {
        System.out.print("Enter quarters: ");
        int quarters = TextIO.getlnInt();

        System.out.print("Enter dimes: ");
        int dimes = TextIO.getlnInt();

        System.out.print("Enter nickels: ");
        int nickels = TextIO.getlnInt();

        System.out.print("Enter pennies: ");
        int pennies = TextIO.getlnInt();

        double total = 0.25*quarters + 0.1*dimes + 0.05*nickels + 0.01*pennies;

        System.out.printf("Total $%1.3f", total);
    }
}
