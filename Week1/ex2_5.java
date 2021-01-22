package Week1;
import utils.TextIO;

public class ex2_5 {
    public static void main(String[] args) {
        System.out.println("How many eggs you many?");
        System.out.print("total Eggs: ");
        int totalEggs = TextIO.getInt();
        int gross = totalEggs / 144;
        int dozen = (totalEggs - gross * 144) / 12;
        int leftOverEggs = totalEggs % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, " + "and " + leftOverEggs);
    }
}
