package uk.gov.metoffice.wave.ripple.demo;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class MainSwitchDemo {
    public static void main(String[] args){
        int n = 5;
        switch (n) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("many");
                break;
        }

        String str = "1";
        switch (str) {
            case "0":
                System.out.println("zero");
                break;
            case "1":
                System.out.println("one");
                break;
            case "2":
                System.out.println("two");
                break;
        }

    }
}
