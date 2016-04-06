package training;

public class Vehicle {
    private double direction;
    private double velocity;

    public void apply(Action action) {
        direction = action.newDirection(direction) % 2*Math.PI;
        velocity = Math.abs(action.newVelocity(velocity));
    }

    public double getDirection() {
        return direction;
    }

    public double getVelocity() {
        return velocity;
    }
}

abstract class Action {
    double newDirection(double direction) {
        return direction;
    }
    double newVelocity(double velocity) {
        return velocity;
    }
}

class TurnClockwise extends Action {
    double newDirection(double direction) {
        return direction + Math.PI/12;
    }
}

class Accelerate extends Action {
    double newVelocity(double velocity) {
        return velocity + 1.;
    }
}
