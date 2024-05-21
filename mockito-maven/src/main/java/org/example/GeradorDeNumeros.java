package org.example;

import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public final class GeradorDeNumeros {

    private static SplittableRandom random = new SplittableRandom(); // Instância de SplittableRandom para gerar números aleatórios

    // Construtor privado para evitar instanciação da classe
    private GeradorDeNumeros(){
    }

    // Método estático para gerar uma lista de números inteiros aleatórios com o tamanho especificado
    public static List<Integer> geraNumerosAleatorios(int tamanhoLista) {
        return random.ints().boxed().limit(tamanhoLista).collect(Collectors.toList()); // Gera números aleatórios e os coleta em uma lista
    }

    // Método estático para gerar uma lista de números inteiros aleatórios com um tamanho aleatório
    public static List<Integer> geraNumerosAleatorios() {
        return random.ints().boxed().limit(random.nextInt(10)).collect(Collectors.toList()); // Gera um tamanho aleatório e depois gera números aleatórios com esse tamanho
    }
}
