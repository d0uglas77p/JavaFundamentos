package collections.map.pesquisa.produto;

public class Produto {

    private String nome;       // Nome do produto
    private double preco;      // Preço do produto
    private int quantidade;    // Quantidade disponível do produto

    // Construtor da classe Produto para inicializar os atributos
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Método para obter o preço do produto
    public double getPreco() {
        return preco;
    }

    // Método para obter a quantidade do produto
    public int getQuantidade() {
        return quantidade;
    }

    // Método toString para representar o objeto Produto como uma string
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
