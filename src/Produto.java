public class Produto {

    private long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String qtd_estoque;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(String qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }
}
