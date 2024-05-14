package collections.set.operacoes.palavra;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributo para armazenar palavras únicas usando um HashSet
    private Set<String> palavrasUnicasSet;

    // Construtor para inicializar o conjunto de palavras únicas
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    // Método para adicionar uma palavra ao conjunto de palavras únicas
    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    // Método para remover uma palavra do conjunto de palavras únicas
    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) { // Verifica se o conjunto não está vazio
            if (palavrasUnicasSet.contains(palavra)) { // Verifica se a palavra está no conjunto
                palavrasUnicasSet.remove(palavra); // Remove a palavra do conjunto
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    // Método para verificar se uma palavra está presente no conjunto
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    // Método para exibir as palavras únicas no conjunto
    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) { // Verifica se o conjunto não está vazio
            System.out.println(palavrasUnicasSet); // Exibe o conjunto de palavras únicas
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando algumas palavras únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python"); // Tentativa de adicionar uma palavra repetida
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as palavras únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma palavra do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Tentando remover uma palavra que não está no conjunto
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma palavra está presente no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as palavras únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
