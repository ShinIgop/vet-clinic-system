import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://mainline.proxy.rlwy.net:41960/railway",
                "root",
                "MprIlzUpEsvDrppnAxhdyDreWMeAannB"
            );

            System.out.println("Connected to Railway MySQL!");

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

        return conn;
    }
}
