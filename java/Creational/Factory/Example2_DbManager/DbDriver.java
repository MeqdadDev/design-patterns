package DesignPatterns.Creational.Factory.DbManager;

abstract public class DbDriver {
    String dbName;
    int dbPort;
    String dbPassword;

    public DbDriver(String dbName, int dbPort, String dbPassword){
        this.dbName = dbName;
        this.dbPort = dbPort;
        this.dbPassword = dbPassword;
    }

    abstract public void connectDb();

    abstract public void disconnectDb();

    abstract public String getDbType();

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public int getDbPort() {
        return dbPort;
    }

    public void setDbPort(int dbPort) {
        this.dbPort = dbPort;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
}
