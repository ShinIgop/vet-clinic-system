import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://YOUR_RAILWAY_HOST:PORT/YOUR_DB",
                "YOUR_USERNAME",
                "YOUR_PASSWORD"
            );

            System.out.println("Connected to Railway MySQL!");

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

        return conn;
    }
}
