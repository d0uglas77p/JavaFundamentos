package org.example;

public class Conta {

    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    // Método para pagar um boleto
    public void pagaBoleto(int valorAPagar) {
        validaSaldo(valorAPagar); // Valida se há saldo suficiente para pagar o boleto
        debita(valorAPagar); // Debita o valor do saldo da conta
        enviaCreditoParaEmissor(valorAPagar); // Envia o valor ao emissor do boleto
    }

    // Método para validar se há saldo suficiente para pagar o boleto
    public void validaSaldo(int valorAPagar) {
        if(valorAPagar > saldo) { // Verifica se o valor a pagar é maior que o saldo
            throw new IllegalStateException("Saldo insuficiente"); // Lança uma exceção se o saldo for insuficiente
        }
    }

    // Método para debitar o valor do saldo da conta
    public void debita(int valorAPagar) {
        this.saldo = this.saldo - valorAPagar; // Subtrai o valor a pagar do saldo
    }

    // Método para enviar o valor ao emissor do boleto (simulação)
    public void enviaCreditoParaEmissor(int valorAPagar) {
        // Envia o valor para o emissor do boleto (lógica não implementada)
    }
}
