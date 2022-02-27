//exemplo de camada service

public class CadastroProdutoService {

    private ProdutoDao dao;

    public CadastroProdutoService(ProdutoDao dao) {
        this.dao = dao;
    }

    public void cadastraProduto(Produto produto){
        this.dao.cadastrar(produto);
    }
}
