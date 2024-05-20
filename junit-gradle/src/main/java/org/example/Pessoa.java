package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    // Método para calcular a idade da pessoa
    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDateTime.now()); // Calcula a diferença em anos entre a data de nascimento e a data atual
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
