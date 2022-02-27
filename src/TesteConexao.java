import java.sql.*;

public class TesteConexao {

    public static void main(String[] args) {

        // esta conexao abaixo foi jogada no arquivo ConexctionFactory
//        String url = "jdbc:postgresql://localhost:5432/LojaVirtual"
        String url = "jdbc:postgresql:LojaVirtual";
        String user = "postgres";
        String password = "123456";

        // esta try abaixo foi jogada no arquivo ConexctionFactory mas tratado com throws
        try (Connection connection = DriverManager.getConnection(url, user,password)){
            //System.out.println(connection.getSchema());
            Statement statement = connection.createStatement();
            statement.execute("select * from produto");

            ResultSet result = statement.getResultSet();
            while (result.next()) {
                String nome = result.getString("nome");
                System.out.println(nome);
            }

        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
