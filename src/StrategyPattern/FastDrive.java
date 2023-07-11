package StrategyPattern;

public class FastDrive implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("This type of cars drive fast");
    }
}
