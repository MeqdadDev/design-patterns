package dp.designpatterns.Adapter

// Adaptee
public class Bicycle {
    public void pedal() {
        System.out.println("Start Cycling...");
    }

    public void stop() {
        System.out.println("Bicycle stopped");
    }

    public void ringBill() {
        System.out.println("Ring Ring...");
    }
}
