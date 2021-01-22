package Week1;
import utils.TextIO;

public class ex2_7 {
    public static void main(String[] args) {
        TextIO.readFile("src/Week1/testdata.txt");
        String name = TextIO.getln();
        int mark1 = TextIO.getlnInt();
        int mark2 = TextIO.getlnInt();
        int mark3 = TextIO.getlnInt();

        double average = (mark1 + mark2 + mark3) / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Average mark: " + average);
    }
}
