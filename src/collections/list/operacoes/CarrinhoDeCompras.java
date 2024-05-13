package collections.list.operacoes;

import java.util.ArrayList;
import java.util.List;

// Classe para gerenciar um carrinho de compras com uma lista de itens.
public class CarrinhoDeCompras {

    private List<Item> itemList; // Lista para armazenar os itens no carrinho.

    // Construtor para inicializar a lista de itens como ArrayList.
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    // Método para adicionar um novo item ao carrinho.
    public void adicionarItem(String nome, double preco, int qtd) {
        Item item = new Item(nome, preco, qtd);
        this.itemList.add(item);
    }

    // Método para remover um item do carrinho com base no nome (ignorando maiúsculas/minúsculas).
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover); // Remove todos os itens da lista principal.
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    // Método para calcular o valor total dos itens no carrinho.
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQtd(); // Calcula o valor do item (preço * quantidade).
                valorTotal += valorItem; // Soma ao valor total.
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // Método para exibir os itens presentes no carrinho.
    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    // Sobrescrita do método toString para exibir detalhes do carrinho.
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    // Método principal para demonstrar o uso da classe CarrinhoDeCompras.
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras.
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho.
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3); // Adicionando outro lápis (será tratado como um item separado).
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens presentes no carrinho.
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho.
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho.
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra.
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}