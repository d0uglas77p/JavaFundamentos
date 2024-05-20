import org.junit.jupiter.api.*; // Importa as anotações do framework JUnit Jupiter

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Define o método de ordenação dos testes como por anotações de ordem
public class EscolhendoAOrdemTeste {

    // Método de teste com ordem 4
    @Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste com ordem 3
    @Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste com ordem 2
    @Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste com ordem 1
    @Order(1)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }
}
