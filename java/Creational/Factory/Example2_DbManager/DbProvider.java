package DesignPatterns.Creational.Factory.DbManager;

public class DbProvider {

    public DbProvider(){};

    public DbDriver createDb(String dbName, int dbPort, String dbPassword, DbType dbType){
        switch (dbType){
            case MongoDB:
                return new MongoDbDriver(dbName,dbPort,dbPassword);
            case PostgreSQL:
                return new PostgreSQLDriver(dbName,dbPort,dbPassword);
            case MySQL:
                return new MySQLDriver(dbName,dbPort,dbPassword);
            default:
                throw new IllegalArgumentException("Unsupported database type: " + dbType);
        }
    }

}
