package collections.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Map mapaSemGenerics = new HashMap(); // Criando um mapa sem Generics (raw type)
        mapaSemGenerics.put("Chave 1", 10); // Adicionando uma chave do tipo String e um valor do tipo Integer
        mapaSemGenerics.put("Chave 2", "valor"); // Adicionando uma chave do tipo String e um valor do tipo String; permite adicionar qualquer tipo de objeto

        // Iterando sobre o mapa sem Generics
        for (Object obj : mapaSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj; // Convertendo cada entrada para um tipo Map.Entry (raw type)
            String chave = (String) entry.getKey(); // Fazendo cast da chave para String
            Object valor = entry.getValue(); // Obtendo o valor (tipo Object)
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Exemplo com Generics
        Map<String, Integer> mapaGenerics = new HashMap<>(); // Criando um mapa com Generics (chave: String, valor: Integer)
        mapaGenerics.put("Chave 1", 10); // Adicionando uma chave do tipo String e um valor do tipo Integer
        mapaGenerics.put("Chave 2", 20); // Adicionando outra chave do tipo String e outro valor do tipo Integer

        // Iterando sobre o mapa com Generics
        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey(); // Obtendo a chave (tipo String)
            int valor = entry.getValue(); // Obtendo o valor (tipo Integer)
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
    }
}
