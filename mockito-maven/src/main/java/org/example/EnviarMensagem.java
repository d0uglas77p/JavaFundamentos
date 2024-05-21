package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnviarMensagem {

    private List<Mensagem> mensagens = new ArrayList<>(); // Lista para armazenar as mensagens

    // Método para adicionar uma mensagem à lista
    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem); // Adiciona a mensagem à lista
    }

    // Método para obter as mensagens (somente leitura)
    public List<Mensagem> getMensagens() {
        return Collections.unmodifiableList(this.mensagens); // Retorna uma cópia não modificável da lista de mensagens
    }

}
