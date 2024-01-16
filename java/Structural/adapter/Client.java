package DesignPatterns;

public class Client {
    public static void main(String[] args) {
        Vehicle car = new Car();
        interactWithVehicle(car);

        Bicycle bicycle = new Bicycle();

//        interactWithVehicle(bicycle);

    }

    private static void interactWithVehicle(Vehicle vehicle){
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
    }
}
