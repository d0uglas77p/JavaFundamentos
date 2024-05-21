package org.example;

public class DadosLocalizacao {


    private String uf;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String bairro;

    // Construtor da classe que recebe os dados de localização como parâmetros
    public DadosLocalizacao(final String uf, final String cidade, final String logradouro, final String complemento, final String bairro) {
        this.uf = uf;
        this.cidade = cidade;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    // Métodos para obter os dados de localização
    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

}
