import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    Connection conn = connectDatabase.connect();

    public void logIn(String username, String password) {
        String query = "SELECT u.username ,u.email ,u.password \n" +
                "FROM users u\n" +
                "WHERE u.username =" + username +
                "AND u.password =" + password;
        int count = 0;
        try {
            Statement stm = conn.createStatement();
            ResultSet resultSet = stm.executeQuery(query);
            while (resultSet.next()) {
                String userName = resultSet.getString("username");
                System.out.println(userName);
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (count != 0) {
            System.out.println("thanh cong");
        } else {
            System.out.println("that bai");
        }
    }
}