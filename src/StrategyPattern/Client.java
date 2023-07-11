package StrategyPattern;

public class Client {
    public static void main(String[] args) {

        Vehicle vehicle = new LuxaryVehicle();
        vehicle.drive();
    }
}
