package training;

import java.util.Random;

public class MainOdd {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i=0; i<20; ++i) {
            int n = random.nextInt(100);
            if (n%2 == 1) {
                System.out.println(n);
            }
        }
    }
}
