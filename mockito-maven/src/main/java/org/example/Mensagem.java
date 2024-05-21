package org.example;

import java.util.UUID;

public class Mensagem {

    private String id;
    private String mensagem;

    // Construtor da classe que recebe a mensagem como parâmetro
    public Mensagem(final String mensagem) {
        this.id = UUID.randomUUID().toString(); // Gera um ID único para a mensagem
        this.mensagem = mensagem;
    }

    public String getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }
}
