import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

    String hostName = "Localhost:8087";
    String dbName = "user";
    String username = "root";
    String password = "123";

    String url = "jdbc:mysql://" + hostName + "/" + dbName;

    public Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            System.out.println("Kết nối không thành công " + e.getMessage());
        }
        return conn;
    }
}
