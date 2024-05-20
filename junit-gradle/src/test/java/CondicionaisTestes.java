import org.junit.jupiter.api.Assertions; // Importa a classe Assertions do framework JUnit Jupiter
import org.junit.jupiter.api.Test; // Importa a anotação Test do framework JUnit Jupiter
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable; // Importa a anotação DisabledIfEnvironmentVariable do framework JUnit Jupiter
import org.junit.jupiter.api.condition.EnabledOnJre; // Importa a anotação EnabledOnJre do framework JUnit Jupiter
import org.junit.jupiter.api.condition.EnabledOnOs; // Importa a anotação EnabledOnOs do framework JUnit Jupiter
import org.junit.jupiter.api.condition.OS; // Importa a enumeração OS do framework JUnit Jupiter
import static org.junit.jupiter.api.condition.JRE.JAVA_21; // Importa a constante JAVA_21 do framework JUnit Jupiter

public class CondicionaisTestes {

    // Método de teste desabilitado se a variável de ambiente "USER" for "Douglas"
    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "Douglas")
    void validarAlgoSomenteNoUsuarioDouglas() {
        Assertions.assertEquals(10, 5 + 5);
    }

    // Método de teste habilitado somente em sistemas operacionais Windows
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void verificarSistemaOperacional() {
        Assertions.assertEquals(10, 5 + 5);
    }

    // Método de teste habilitado somente na versão Java 21
    @Test
    @EnabledOnJre(JAVA_21)
    void verificarVersaoJava() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
