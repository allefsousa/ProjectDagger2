package com.project.allef.dagger2.data;

public class Car {
    public static final String SPEED = "br.com.allef.developer.SPEED";
    private Engine engine;
    public void increaseSpeed(int value){
        engine.accelerate(value);
    }
    public void stop(){
        engine.brake();
    }
    public int getSpeed(){
        return engine.getRpm();
    }
}
