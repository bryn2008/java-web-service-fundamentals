package uk.gov.metoffice.wave.ripple.demo;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class MainOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number?");
        int count = scanner.nextInt();
        Random random = new Random();
        System.out.println(random.nextInt(count));
    }
}