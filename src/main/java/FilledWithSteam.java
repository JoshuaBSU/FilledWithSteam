//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;
public class FilledWithSteam {
    public static void main(String [] args)
    {
        String dbLocation = "jdbc:sqlite:userGames.db";
        DatabaseInitialization(dbLocation);

    }

    public static void DatabaseInitialization(String dbLocation)
    {
        SQLiteDBManagement sqlDBManager = new SQLiteDBManagement();
        // Check for files existence
        File dbFileCheck = new File("userGames.db");
        if (!dbFileCheck.exists()) {
            sqlDBManager.blankDBMaker(dbLocation);
        }
    }
}
