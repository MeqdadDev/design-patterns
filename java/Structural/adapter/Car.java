package dp.designpatterns.Adapter

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car starts accelerating...");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beeeeeeb Beeeeb");
    }

}
