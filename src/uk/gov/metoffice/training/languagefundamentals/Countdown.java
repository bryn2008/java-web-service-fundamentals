package uk.gov.metoffice.training.languagefundamentals;

import java.util.Scanner;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class Countdown {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a start count? ");
        int start = scanner.nextInt();
        while (start >= 0) {
            System.out.println(start);
            --start;
        }
    }
}
