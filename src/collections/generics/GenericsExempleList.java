package collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList(); // Criando uma lista sem Generics (raw type)
        listaSemGenerics.add("Elemento 1"); // Adicionando uma String à lista
        listaSemGenerics.add(10); // Adicionando um Integer à lista; permitido devido ao uso de raw type

        // Iterando sobre a lista sem Generics
        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento; // Fazendo cast para String; pode gerar ClassCastException
            System.out.println(str);
        }

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>(); // Criando uma lista com Generics para armazenar Strings
        listaGenerics.add("Elemento 1"); // Adicionando uma String à lista
        listaGenerics.add("Elemento 2"); // Adicionando outra String à lista

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento); // Não é necessário fazer cast; tipos garantidos pelo uso de Generics
        }
    }
}
