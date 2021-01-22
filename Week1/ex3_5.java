package Week1;
import utils.TextIO;

public class ex3_5 {
    public static void main(String[] args) {
        TextIO.readFile("src/Week1/sales.dat");
        int count = 0;
        double total = 0;
        String priceStr;

        while (!TextIO.eof()) {
            priceStr = TextIO.getln();
            double price;
            try {
                price = Double.parseDouble(priceStr.substring(priceStr.indexOf(":") + 2));
                total += price;
            }
            catch (NumberFormatException e) {
                count++;
            }
        }

        System.out.printf("Total sales: %1.3f \n", total);
        System.out.println("Total cities has no data: " + count);
    }
}
