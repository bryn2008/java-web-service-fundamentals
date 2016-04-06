package uk.gov.metoffice.training.expressions;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class TimesTable {

    public static void main(String[] args) {
        System.out.format("%4s", "");
        for (int hdr=1; hdr<=12; ++hdr) {
            System.out.format("%4d", hdr);
        }
        System.out.println();
        for (int row=1; row<=12; ++row) {
            System.out.format("%4d", row);
            for (int col=1; col<=12; ++col) {
                System.out.format("%4d", row*col);
            }
            System.out.println();
        }
    }

}