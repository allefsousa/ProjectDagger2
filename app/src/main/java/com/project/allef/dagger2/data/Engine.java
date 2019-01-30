package com.project.allef.dagger2.data;

public class Engine {
    private int rpm;

    public Engine() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void brake() {
        rpm = 0;
    }

    public void accelerate(int value) {
        rpm = rpm+value;
    }
}
