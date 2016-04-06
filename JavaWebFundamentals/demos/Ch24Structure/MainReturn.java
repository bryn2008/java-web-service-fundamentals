package training;

import java.util.Random;

public class MainReturn {
    public static void main(String[] args) {
        int n = generateNumber(1,59);
        System.out.println(n);
        double d = generateNumber(1.,59.);
        System.out.println(d);
    }

    private final static Random random = new Random();
    private static int generateNumber(int lower, int upper) {
        return random.nextInt(upper-lower)+lower;
    }
    private static double generateNumber(double lower, double upper) {
        return random.nextDouble()*(upper-lower) + lower;
    }
}

