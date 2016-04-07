package uk.gov.metoffice.training.programstructure;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class ProjectilePaths {
    public static void main(String[] args) {
        int angle = launchAngle(100, 1000);
        System.out.format("v=100, r=1000, angle=%d\n",angle );
        System.out.format("v=100, angle=%d, range=%.2f\n", angle, calcRange(100., angle));
    }

    private static final double G = 9.81;

    private static int launchAngle(double velocity, double range) {
        return  (int)Math.toDegrees(Math.asin(range * G / Math.pow(velocity, 2)) / 2);
    }

    private static double calcRange(Double velocity, int angle){
        return (double)Math.toRadians(2 * Math.pow(velocity,2) * Math.cos(angle) * Math.sin(angle) / G);
    }
}
