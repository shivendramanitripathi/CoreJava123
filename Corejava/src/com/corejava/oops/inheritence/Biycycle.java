package com.corejava.oops.inheritence;

public class Biycycle {
    private int speed;
    private int gear;

    public Biycycle() {
    }

    public Biycycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    @Override
    public String toString() {
        return "speed is " + speed +
                " and no. of gears are " + gear ;
    }
}

