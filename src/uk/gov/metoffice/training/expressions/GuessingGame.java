package uk.gov.metoffice.training.expressions;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class GuessingGame {
    public static void main(String[] args){

        Random random = new Random();
        int randomNum = random.nextInt((10 - 1) + 1) + 1;
        System.out.println("Please select a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int scanIn = scanner.nextInt();
        if (scanIn == randomNum){
            System.out.println("You gessed correct");
        }else {
            System.out.println("The correct number was " + randomNum);
        }
    }
}