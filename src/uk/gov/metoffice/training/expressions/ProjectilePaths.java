package uk.gov.metoffice.training.expressions;

import uk.gov.metoffice.wave.ripple.demo.Main;

/**
 * Created by bryn.lloyd on 06/04/2016.
 */
public class ProjectilePaths {
    public static void main(String[] args){
        double gravity = 9.81;
        double velocity = 35;
        double distance = 100;

        double theta = Math.asin(distance * gravity / Math.pow(velocity,2.0)) / 2.0;
        System.out.format("Launch angle is %.1f\n", Math.toDegrees(theta));

        double check = 2.0 * Math.pow(velocity,2.0) * Math.cos(theta) * Math.sin(theta) / gravity;
        System.out.format("Checked range is %.2f\n", check);
    }
}
