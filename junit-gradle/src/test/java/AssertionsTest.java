import org.example.Pessoa;
import org.junit.jupiter.api.Test; // Importa a anotação Test do framework JUnit Jupiter

import static org.junit.jupiter.api.Assertions.*; // Importa todas as classes e métodos estáticos de Assertions

import java.time.LocalDateTime; // Importa a classe LocalDateTime do pacote java.time

public class AssertionsTest {

    // Método de teste para validar se dois arrays são iguais
    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50}; // Define um array de inteiros
        int[] segundoLancamento = {10, 20, 30, 40, 50}; // Define outro array de inteiros

        assertArrayEquals(primeiroLancamento, segundoLancamento); // Verifica se os dois arrays são iguais
    }

    // Método de teste para validar se um objeto é nulo ou não
    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null; // Inicializa uma variável do tipo Pessoa como nula

        assertNull(pessoa); // Verifica se o objeto pessoa é nulo

        pessoa = new Pessoa("Luciano", LocalDateTime.now()); // Cria uma nova instância da classe Pessoa
        assertNotNull(pessoa); // Verifica se o objeto pessoa não é nulo
    }

    // Método de teste para validar a igualdade de dois números de tipos diferentes
    @Test
    void validarNumerosdeTiposDiferentes() {
        double valor = 5.0; // Define uma variável do tipo double
        double outroValor = 5.0; // Define outra variável do tipo double

        assertEquals(valor, outroValor); // Verifica se os dois valores são iguais
    }

}
