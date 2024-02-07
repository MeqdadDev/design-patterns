package DesignPatterns.Creational.Factory.DbManager;

public class DbClient {
    public static void main(String[] args) {
        DbProvider dbProvider = new DbProvider();

        DbDriver employeesDb = dbProvider.CreateDb("employees", 1234,
                "EMP_DB_PASSWORD_HERE", DbType.MySQL);

        employeesDb.connectDb();

        DbDriver analyticsDb = dbProvider.CreateDb("analytics", 5678,
                "ANALYTICS_DB_PASSWORD_HERE", DbType.MongoDB);

//        analyticsDb.connectDb();
        System.out.println("Analytics Database Type is " + analyticsDb.getDbType());

        DbDriver productsDb = dbProvider.CreateDb("products", 2468,
                "PRODUCTS_DB_PASSWORD_HERE", DbType.PostgreSQL);

//        productsDb.connectDb();


        employeesDb.disconnectDb();
//        analyticsDb.disconnectDb();
//        productsDb.disconnectDb();

//        -------------------------------------------
//      ** Additional Note: For clean code and best practice, it is preferred to add the Singleton
//      pattern to make sure that there is only one connection with database in the session.
    }
}
