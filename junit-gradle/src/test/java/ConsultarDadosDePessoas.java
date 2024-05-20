import org.example.BancoDeDados; // Importa a classe BancoDeDados do pacote org.example
import org.example.Pessoa; // Importa a classe Pessoa do pacote org.example
import org.junit.jupiter.api.*; // Importa as anotações do framework JUnit Jupiter
import java.time.LocalDateTime; // Importa a classe LocalDateTime do pacote java.time

public class ConsultarDadosDePessoas {

    // Método executado uma vez antes de todos os testes
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao(); // Inicia a conexão com o banco de dados
    }

    // Método executado antes de cada teste
    @BeforeEach
    void insereDadosParaTeste() {
        // Insere dados de teste no banco de dados
        BancoDeDados.insereDados(new Pessoa("Leonardo", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    // Método executado após cada teste
    @AfterEach
    void removeDadosParaTeste() {
        // Remove os dados de teste do banco de dados
        BancoDeDados.removeDados(new Pessoa("Leonardo", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    // Teste para validar os dados de retorno (exemplo: teste bem-sucedido)
    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true); // Verifica se a condição é verdadeira
    }

    // Teste para validar os dados de retorno (exemplo: teste falhando)
    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null); // Verifica se o valor é nulo
    }

    // Método executado uma vez após todos os testes
    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finilizarConexao(); // Finaliza a conexão com o banco de dados
    }
}
