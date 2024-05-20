package org.example;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if(valor <= 0) {
            // Lança uma exceção IllegalArgumentException com uma mensagem informando que o valor deve ser maior que zero
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }

        contaDestino.lancaCredito(valor);
        contaOrigem.lancaDebito(valor);
    }
}
