package collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    // Construtor da classe ContagemPalavras
    public ContagemPalavras() {
        this.palavras = new HashMap<>(); // Inicializa o mapa para armazenar as palavras e suas contagens
    }

    // Método para adicionar uma palavra e sua contagem ao mapa
    public void adicionarPalavras(String linguagem, Integer contagem) {
        palavras.put(linguagem, contagem); // Adiciona a palavra e sua contagem ao mapa
    }

    // Método para remover uma palavra do mapa
    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra); // Remove a palavra do mapa se o mapa não estiver vazio
        } else {
            System.out.println("O Map está vazio.");
        }
    }

    // Método para calcular e exibir a contagem total de todas as palavras no mapa
    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavras.values()) {
            contagemTotal += contagem; // Soma todas as contagens das palavras no mapa
        }
        return contagemTotal; // Retorna a contagem total
    }

    // Método para encontrar a palavra mais frequente no mapa (a que tem a maior contagem)
    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue(); // Atualiza a maior contagem encontrada
                linguagemMaisFrequente = entry.getKey(); // Obtém a palavra correspondente à maior contagem
            }
        }
        return linguagemMaisFrequente; // Retorna a palavra mais frequente
    }

    // Método main para testar a classe ContagemPalavras
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras(); // Cria uma instância da classe ContagemPalavras

        // Adiciona linguagens e suas contagens ao mapa
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de palavras (linguagens)
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a palavra mais frequente (linguagem mais frequente)
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
