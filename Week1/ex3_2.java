package Week1;

public class ex3_2 {
    public static void main(String[] args) {

        int max = 1;
        int count = 1, maxCount = 1;
        int numTest;
        for (int i=2; i<=10000; i++) {

            numTest = i;
            count = 1;
            for (int j=2; j<=numTest; j++) {
                if (numTest % j ==0)
                    count++;
            }

            if (count > maxCount){
                max = numTest;
                maxCount = count;
            }
        }

        System.out.println("Max num: " + max + " max count: " + maxCount);
    }
}
