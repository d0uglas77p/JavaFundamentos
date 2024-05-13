package estrutura.array;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        // Declarando e inicializando uma lista de Strings usando ArrayList
        List<String> nomes = new ArrayList<>();

        // Adicionando elementos à lista
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");
        nomes.add("David");

        // Acessando e imprimindo elementos da lista
        System.out.println("Primeiro nome: " + nomes.get(0));
        System.out.println("Segundo nome: " + nomes.get(1));
        System.out.println("Terceiro nome: " + nomes.get(2));
        System.out.println("Quarto nome: " + nomes.get(3));

        // Imprimindo todos os nomes da lista usando um loop
        System.out.println("Lista de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
