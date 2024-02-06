package DesignPatterns.Creational.Factory.DbManager;

public class DbProvider {

    public DbProvider(){};

    public DbDriver CreateDb(String dbName, int dbPort, String dbPassword, String dbType){
        switch (dbType){
            case "MongoDb":
                return new MongoDbDriver(dbName,dbPort,dbPassword);
            case "PostgreSQL":
                return new PostgreSQLDriver(dbName,dbPort,dbPassword);
            case "MySQL":
                return new MySQLDriver(dbName,dbPort,dbPassword);
        }
        return null;
    }

}
