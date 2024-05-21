package org.example;

import java.time.LocalDate;

public class CadastrarPessoa {

    private ApiDosCorreios apiDosCorreios; // Variável para armazenar a referência à API dos Correios

    // Construtor da classe que recebe uma instância de ApiDosCorreios como parâmetro
    public CadastrarPessoa(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios; // Inicializa a variável apiDosCorreios
    }

    // Método para cadastrar uma pessoa
    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        // Cria uma nova instância de Pessoa com os dados fornecidos
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        // Busca os dados de localização com base no CEP utilizando a API dos Correios
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(cep);
        // Adiciona os dados de endereço à pessoa
        pessoa.adicionaDadosDeEndereco(dadosLocalizacao);
        // Retorna a instância da pessoa criada
        return pessoa;
    }
}
