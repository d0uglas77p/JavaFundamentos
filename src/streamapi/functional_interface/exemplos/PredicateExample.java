package streamapi.functional_interface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisCincoCaracteres = palavra -> palavra.length() > 5;

        // usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida
        // imprimir cada palavra qu passou o filtro
        palavras.stream().filter(maisCincoCaracteres).forEach(System.out::println);
    }

}
