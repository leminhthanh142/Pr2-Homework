package Week1;

public class ex2_2 {
    public static void main(String[] args) {
        int firstDie = (int) (Math.random() * 6) + 1;
        int secondDie = (int) (Math.random() * 6) + 1;
        int total = firstDie + secondDie;

        System.out.println("The first die comes up " + firstDie);
        System.out.println("The second die comes up " + secondDie);
        System.out.println("Your total roll " + total);
    }
}
