package uk.gov.metoffice.training.languagefundamentals;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class TimesTables {

    public static void main(String[] args) {

        for(int i=1; i<=12; i++){
            for (int k=1; k<=12; k++){
                System.out.print(i*k);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
