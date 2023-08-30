package DesignPatterns.Creational.Singleton.LazySingleton;

public class LazySingleton {
    private static LazySingleton instance;
    private int numberOfConnections;
    {
        numberOfConnections = 0;
    }

    public static LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    private LazySingleton(){
        numberOfConnections++;
    }

    public void connectDb(){
        System.out.println("Database connection with id: {"
                + numberOfConnections + "} initialized");
    }
}
