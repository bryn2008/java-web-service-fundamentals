package training;

import java.util.Random;

public class MainMethod {
    public static void main(String[] args) {
        printNumber(1,59);
        Generator.printInRange(1,59);
    }
    private static void printNumber(int lower, int upper) {
        Random random = new Random();
        System.out.println(random.nextInt(upper-lower)+lower);
    }
}

class Generator {
    private final static Random random = new Random();
    public static void printInRange(int lower, int upper) {
        System.out.println(random.nextInt(upper-lower)+lower);
    }
}