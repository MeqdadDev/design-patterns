package DesignPatterns.Creational.Factory.DbManager;

public class MySQLDriver extends DbDriver{
    DbType dbType;
    public MySQLDriver(String dbName, int dbPort, String dbPassword){
        super(dbName, dbPort, dbPassword);
        this.dbType = DbType.MySQL;
        System.out.println("MySQL Driver is created.");
    }

    @Override
    public void connectDb() {
        System.out.println("Connecting to " + this.dbType + " ...");
        System.out.println(dbType + " Connected!");
    }

    @Override
    public void disconnectDb() {
        System.out.println("Disconnecting " + this.dbType);
        System.out.println(dbType + " Disconnected.");
    }

    @Override
    public DbType getDbType() {
        return dbType;
    }

}
