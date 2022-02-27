import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //String url = "jdbc:postgresql://localhost:5432/LojaVirtual"
    private final String url = "jdbc:postgresql:LojaVirtual";
    private final String user = "postgres";
    private final String password = "123456";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}
