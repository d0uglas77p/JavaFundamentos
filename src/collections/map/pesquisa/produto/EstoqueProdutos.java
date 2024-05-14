package collections.map.pesquisa.produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap; // Mapa para armazenar produtos com base no código

    // Construtor da classe EstoqueProdutos
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>(); // Inicializa o mapa como um HashMap
    }

    // Método para adicionar um produto ao estoque com base no código
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade)); // Adiciona o produto ao mapa com o código como chave
    }

    // Método para exibir todos os produtos no estoque
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap); // Exibe todos os produtos no mapa
    }

    // Método para calcular o valor total do estoque (soma do valor de todos os produtos)
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco(); // Calcula o valor total de cada produto e acumula
            }
        }
        return valorTotalEstoque;
    }

    // Método para obter o produto mais caro do estoque
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) { // Verifica se o preço do produto atual é maior que o maior preço encontrado até agora
                    produtoMaisCaro = p; // Atualiza o produto mais caro encontrado
                    maiorPreco = p.getPreco(); // Atualiza o valor do maior preço
                }
            }
        }
        return produtoMaisCaro; // Retorna o produto mais caro encontrado
    }

    public static void main(String[] args) {
        // Cria uma instância da classe EstoqueProdutos
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe os produtos inicialmente (deve estar vazio)
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Produto 1", 10, 1.0);
        estoque.adicionarProduto(2L, "Produto 2", 20, 20.0);
        estoque.adicionarProduto(3L, "Produto 3", 30, 300.0);

        // Exibe os produtos no estoque após a adição
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor Total do Estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro do estoque
        System.out.println("Produto Mais Caro: " + estoque.obterProdutoMaisCaro());
    }
}
