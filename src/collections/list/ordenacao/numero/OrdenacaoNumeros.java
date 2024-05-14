package collections.list.ordenacao.numero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe para gerenciar e ordenar uma lista de números inteiros.
public class OrdenacaoNumeros {

    private List<Integer> numerosList; // Lista de números inteiros.

    // Construtor para inicializar a lista de números como ArrayList.
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    // Método para adicionar um número à lista.
    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    // Método para ordenar a lista de números em ordem ascendente.
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // Método para ordenar a lista de números em ordem descendente.
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // Método para exibir os números presentes na lista.
    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    // Método principal para demonstrar o uso da classe OrdenacaoNumeros.
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista novamente
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista novamente
        numeros.exibirNumeros();
    }
}
