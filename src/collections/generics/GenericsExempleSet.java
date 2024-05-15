package collections.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet(); // Criando um conjunto sem Generics (raw type)
        conjuntoSemGenerics.add("Elemento 1"); // Adicionando uma String ao conjunto
        conjuntoSemGenerics.add(10); // Adicionando um Integer ao conjunto; permite adicionar qualquer tipo de objeto

        // Iterando sobre o conjunto sem Generics
        for (Object elemento : conjuntoSemGenerics) {
            String str = (String) elemento; // Fazendo cast de cada elemento para String
            System.out.println(str);
        }

        // Exemplo com Generics
        Set<String> conjuntoGenerics = new HashSet<>(); // Criando um conjunto com Generics (apenas Strings)
        conjuntoGenerics.add("Elemento 1"); // Adicionando uma String ao conjunto
        conjuntoGenerics.add("Elemento 2"); // Adicionando outra String ao conjunto

        // Iterando sobre o conjunto com Generics
        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }
    }
}
