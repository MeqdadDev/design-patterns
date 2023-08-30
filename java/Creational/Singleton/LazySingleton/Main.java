package DesignPatterns.Creational.Singleton.LazySingleton;

import DesignPatterns.Creational.Singleton.LazySingletonThreadSafe.LazySingletonThreadSafe;

public class Main {
    public static void main(String[] args) {
//        Rejected.....
//        LazySingleton postgres = new LazySingleton();
        LazySingleton postgres1 = LazySingleton.getInstance();
        postgres1.connectDb();

        LazySingleton postgres2 = LazySingleton.getInstance();
        postgres2.connectDb(); // the same connection, not new

        LazySingleton postgres3 = LazySingleton.getInstance();
        postgres3.connectDb(); // the original connection, not new
    }
}
