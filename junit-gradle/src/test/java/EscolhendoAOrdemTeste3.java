import org.junit.jupiter.api.*; // Importa as anotações do framework JUnit Jupiter

@TestMethodOrder(MethodOrderer.DisplayName.class) // Define o método de ordenação dos testes como pelo nome de exibição dos métodos
public class EscolhendoAOrdemTeste3 {

    // Método de teste com nome de exibição "1"
    @DisplayName("1")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste com nome de exibição "2"
    @DisplayName("2")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste com nome de exibição "3"
    @DisplayName("3")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste com nome de exibição "4"
    @DisplayName("4")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }
}
