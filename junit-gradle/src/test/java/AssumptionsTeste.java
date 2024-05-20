import org.junit.jupiter.api.Assertions; // Importa a classe Assertions do framework JUnit Jupiter
import org.junit.jupiter.api.Assumptions; // Importa a classe Assumptions do framework JUnit Jupiter
import org.junit.jupiter.api.Test; // Importa a anotação Test do framework JUnit Jupiter

public class AssumptionsTeste {

    // Método de teste para validar algo somente se o usuário for "Douglas"
    @Test
    void validarAlgoSomenteNoUsuarioDouglas() {
        // Assume que o valor da variável de ambiente "USER" é "Douglas"
        Assumptions.assumeTrue("Douglas".equals(System.getenv("USER")));

        // Executa a asserção somente se a condição assumida for verdadeira
        Assertions.assertEquals(10, 5 + 5);
    }

    // Método de teste para validar algo somente se o usuário não for "root"
    @Test
    void validarAlgoSomenteNoUsuarioDouglas2() {
        // Assume que o valor da variável de ambiente "USER" não é "root"
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));

        // Executa a asserção somente se a condição assumida for falsa
        Assertions.assertEquals(10, 5 + 5);
    }
}
