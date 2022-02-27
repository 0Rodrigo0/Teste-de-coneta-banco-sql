import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao {

    private Connection connection;

    public ProdutoDao(Connection connection) {
        this.connection = connection;
    }

    public void cadastrar(Produto produto) {
        try{
        String sql = "INSERT INTO produto (nome, descricao, preco, qtd_estoque) VALUES (?,?,?,?)";
        //sanitização dos inputs com prepareStatement
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, produto.getNome());
        ps.setString(2, produto.getDescricao());
        ps.setDouble(3, produto.getPreco());
        ps.setString(4, produto.getQtd_estoque());

        ps.execute();
        ps.close();
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}
