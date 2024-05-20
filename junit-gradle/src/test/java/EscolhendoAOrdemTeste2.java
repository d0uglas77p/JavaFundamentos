import org.junit.jupiter.api.*; // Importa as anotações do framework JUnit Jupiter

@TestMethodOrder(MethodOrderer.MethodName.class) // Define o método de ordenação dos testes como pelo nome dos métodos
public class EscolhendoAOrdemTeste2 {

    // Método de teste validaFluxoA()
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste validaFluxoB()
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste validaFluxoC()
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Método de teste validaFluxoD()
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }
}
