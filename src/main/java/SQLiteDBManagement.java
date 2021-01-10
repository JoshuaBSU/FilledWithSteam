import java.sql.*;
import java.util.*;

public class SQLiteDBManagement {
    private Connection conn = null;

    // creates a connection and returns it so we can manually close if needed.
    public void dbConnection(String dbLocation) {
        try {
            // Setting up forName so commands don't get thrown into an error
            Class.forName("org.sqlite.JDBC");
            // create connection and statement
            conn = DriverManager.getConnection(dbLocation);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void dbConnectionClose() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Send commands to DB without any return information
    public void dbManager(String sqlCommand) {
        try {
            // create connection and statement
            Statement statement = conn.createStatement();
            statement.execute(sqlCommand);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // manually close connection later
    }

    public void blankDBMaker(String dbLocation) {
        try {
            // Setting up forName so commands don't get thrown into an error
            Class.forName("org.sqlite.JDBC");
            // create connection and statement
            conn = DriverManager.getConnection(dbLocation);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Pending functions based on scope
}
