package collections.map.operacoes;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    // Construtor da classe Dicionario
    public Dicionario() {
        this.dicionario = new HashMap<>(); // Inicializa o dicionário como um HashMap
    }

    // Método para adicionar uma palavra e sua definição ao dicionário
    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao); // Adiciona a palavra e sua definição ao mapa
    }

    // Método para remover uma palavra do dicionário
    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra); // Remove a palavra do mapa se o dicionário não estiver vazio
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    // Método para pesquisar a definição de uma palavra no dicionário
    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra); // Obtém a definição da palavra do mapa
        if (definicao != null) {
            return definicao; // Retorna a definição se a palavra estiver no dicionário
        }
        return "Linguagem não encontrada no dicionário."; // Retorna mensagem se a palavra não estiver no dicionário
    }

    // Método para exibir todas as palavras e suas definições no dicionário
    public void exibirPalavras() {
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario); // Exibe todas as palavras e suas definições se o dicionário não estiver vazio
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    // Método main para testar a classe Dicionario
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario(); // Cria uma instância da classe Dicionario

        // Adicionar palavras e suas definições
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras e suas definições no dicionário
        dicionario.exibirPalavras();

        // Pesquisar a definição de uma palavra específica
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        // Pesquisar por uma palavra que não existe no dicionário
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra do dicionário
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras(); // Exibir o dicionário após a remoção
    }
}
