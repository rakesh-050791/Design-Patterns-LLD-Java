package StrategyPattern;

public class SlowDrive implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("This car drives too slow");
    }
}
