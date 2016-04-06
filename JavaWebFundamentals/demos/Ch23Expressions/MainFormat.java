package training;

public class MainFormat {
    public static void main(String[] args) {
        System.out.format("%6s %6s\n", "Angle", "Sine");
        for (int angle=0; angle<=90; angle+=15) {
            double sin = Math.sin(Math.toRadians(angle));
            System.out.println(String.format("%6d %6.3f", angle, sin));
        }
    }
}
