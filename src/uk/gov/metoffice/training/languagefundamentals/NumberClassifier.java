package uk.gov.metoffice.training.languagefundamentals;

import java.util.Random;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class NumberClassifier {
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(98)+1;
        System.out.print(number);
        if (number >= 67) {
            System.out.println(" is large");
        }
        else if (number >= 33) {
            System.out.println(" is medium");
        }
        else {
            System.out.println(" is small");
        }
    }
}
