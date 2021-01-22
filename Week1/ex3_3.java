package Week1;
import utils.TextIO;

public class ex3_3 {
    public static void main(String[] args) {
        double firstNum, secondNum;
        char operator;
        double result = 0;

        while (true) {
            System.out.println("Enter expression");
            firstNum = TextIO.getDouble();
            if (firstNum == 0)
                break;

            operator = TextIO.getChar();
            secondNum = TextIO.getlnDouble();

            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    result = firstNum / secondNum;
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.printf("Result: %1.3f \n", result);
        }
        System.out.println("Goodbye!!");
    }
}
