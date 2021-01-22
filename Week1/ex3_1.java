package Week1;

public class ex3_1 {
    public static void main(String[] args) {
        int firstDie, secondDie, count = 0;

        do {
            firstDie = (int) (Math.random() * 6) + 1;
            secondDie = (int) (Math.random() * 6) + 1;
            count++;
        }
        while (firstDie !=1 || secondDie !=1);
        System.out.println("Total: " + count + " times");
    }
}
