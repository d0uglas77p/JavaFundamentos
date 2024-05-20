import org.example.Conta; // Importa a classe Conta do pacote org.example
import org.example.TransferenciaEntreContas; // Importa a classe TransferenciaEntreContas do pacote org.example
import org.junit.jupiter.api.Assertions; // Importa a classe Assertions do framework JUnit Jupiter
import org.junit.jupiter.api.Test; // Importa a anotação Test do framework JUnit Jupiter

public class ExceptionsTeste {

    // Teste para validar um cenário de exceção na transferência
    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0); // Cria uma conta de origem com saldo zero
        Conta contaDestino = new Conta("654321", 100); // Cria uma conta de destino com saldo 100

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas(); // Instancia um objeto de transferência entre contas

        // Verifica se uma IllegalArgumentException é lançada ao tentar transferir um valor negativo
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }

    // Teste para validar um cenário em que não é esperada exceção na transferência
    @Test
    void validarCenarioDeExcecaoNaTransferencia2() {
        Conta contaOrigem = new Conta("123456", 0); // Cria uma conta de origem com saldo zero
        Conta contaDestino = new Conta("456548", 100); // Cria uma conta de destino com saldo 100

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas(); // Instancia um objeto de transferência entre contas

        // Verifica se nenhuma exceção é lançada ao tentar transferir um valor positivo
        Assertions.assertDoesNotThrow(() ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
