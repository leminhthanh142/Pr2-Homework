package Week1;
import utils.TextIO;

public class ex3_4 {
    public static void main(String[] args) {
        System.out.print("Enter sentence: ");
        String line = TextIO.getln();
        boolean check = false;
        for (int i=0; i<line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                System.out.print(line.charAt(i));
                check = true;
            }
            else {
                if (check) {
                    System.out.println();
                    check = false;
                }

            }
        }
    }
}
