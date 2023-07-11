package StrategyPattern;

public class Vehicle {
    DrivingStrategy driveObject;

    //this is known as constructor injection.
    public Vehicle(DrivingStrategy strategy){
        this.driveObject = strategy;
    }

    public void drive(){
        driveObject.drive();
    }
}
