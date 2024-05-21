package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private String documento;
    private LocalDate nascimento;
    private DadosLocalizacao endereco;

    public Pessoa(final String nome, final String documento, final LocalDate nascimento) {
        this.nome = nome;
        this.documento = documento;
        this.nascimento = nascimento;
    }

    public void adicionaDadosDeEndereco(DadosLocalizacao dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public DadosLocalizacao getEndereco() {
        return endereco;
    }

    // Método para verificar se a pessoa é maior de idade
    public boolean ehMaiorDeIdade() {
        return ChronoUnit.YEARS.between(this.nascimento, LocalDate.now()) > 18L; // Verifica se a diferença entre a data de nascimento e a data atual é maior que 18 anos
    }
}
