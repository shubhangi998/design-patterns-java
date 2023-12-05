package Singleton;

public class Database {
    private static Database database = null;
    //created private constructor so that no one can create a object of the class directly
    private Database(){
    }
    public static Database getInstance(){
        if(database == null) {
            synchronized (Database.class) { //thread safe in case it is not eager loading
                if(database == null)
                    database = new Database();
            }
        }
        return database;
    }
}
