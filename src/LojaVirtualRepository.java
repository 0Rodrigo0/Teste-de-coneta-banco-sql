import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LojaVirtualRepository {
        public static void main(String[] args) throws SQLException {
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

//            Statement insert = conn.createStatement();
            Statement del = conn.createStatement();
//
//           insert.execute("INSERT INTO PRODUTO (nome, descricao, preco, qtd_estoque)" +
//                    " VALUES ('Livro Coenxao', 'Livro didatico sobre o coenxao banco', 300, 25)," +
//                           "('Livro Coenxao', 'Livro didatico sobre o coenxao banco', 300, 25)",
//                    insert.RETURN_GENERATED_KEYS);
//
//            ResultSet result = insert.getGeneratedKeys();
//            while (result.next()){
//                int id = result.getInt(1);
//                System.out.println("ID gerado: " + id);
//            }

//            del.execute("DELETE FROM produto WHERE nome = 'Livro SPRING boot' AND id > 8 AND id < 13 ");
//            del.execute("DELETE FROM produto WHERE nome = 'Livro Coenxao' AND id > 13");

            del.execute("DELETE FROM produto WHERE nome = 'Livro JAVA' AND id > 6");
            int registrosModificadas = del.getUpdateCount();
            System.out.println("Foram apagados " + registrosModificadas);
        }
    }

