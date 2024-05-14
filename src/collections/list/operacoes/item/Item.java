package collections.list.operacoes.item;

// Classe para representar um item com nome, preço e quantidade.
public class Item {

    private String nome;
    private double preco;
    private int qtd;

    // Construtor para inicializar um item com nome, preço e quantidade.
    public Item(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = quant;
    }

    // Métodos para obter nome, preço e quantidade do item.
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    // Sobrescrita do método toString para exibir detalhes do item.
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quant=" + qtd +
                '}';
    }
}