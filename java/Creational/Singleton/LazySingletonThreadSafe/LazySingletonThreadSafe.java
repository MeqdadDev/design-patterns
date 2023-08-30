package DesignPatterns.Creational.Singleton.LazySingletonThreadSafe;

import DesignPatterns.Creational.Singleton.LazySingleton.LazySingleton;

public class LazySingletonThreadSafe {
    private static volatile LazySingletonThreadSafe instance;
    private int numberOfConnections;
    {
        numberOfConnections = 0;
    }

    public static LazySingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (LazySingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new LazySingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    private LazySingletonThreadSafe(){
        numberOfConnections++;
    }

    public void connectDb(){
        System.out.println("Database connection with id: {"
                + numberOfConnections + "} initialized");
    }
}
