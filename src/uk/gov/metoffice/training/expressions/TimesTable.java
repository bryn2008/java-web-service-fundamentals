package uk.gov.metoffice.training.expressions;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class TimesTable {

    public static void main(String[] args) {

        for(int i=0; i<12; i++){
            System.out.println(i);
            for (int j = 0; j < 12; j++) {
                System.out.print(i+ j);
            }

        }
    }
}
