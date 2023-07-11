package StrategyPattern;

public class RandomDrive implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("This car speed is un-predictable");
    }
}
