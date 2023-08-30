package DesignPatterns.Creational.Singleton.LazySingletonThreadSafe;

public class Main {
    public static void main(String[] args) {
//        Rejected.....
//        LazySingleton postgres = new LazySingleton();
        LazySingletonThreadSafe postgres1 = LazySingletonThreadSafe.getInstance();
        postgres1.connectDb();

        LazySingletonThreadSafe postgres2 = LazySingletonThreadSafe.getInstance();
        postgres2.connectDb(); // the original connection, not new

        LazySingletonThreadSafe postgres3 = LazySingletonThreadSafe.getInstance();
        postgres3.connectDb(); // the original connection, not new
    }
}
