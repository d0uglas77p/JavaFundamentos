import org.example.Pessoa; // Importa a classe Pessoa do pacote org.example
import org.junit.jupiter.api.Assertions; // Importa a classe Assertions do framework JUnit Jupiter
import org.junit.jupiter.api.Test; // Importa a anotação Test do framework JUnit Jupiter

import java.time.LocalDateTime; // Importa a classe LocalDateTime do pacote java.time

public class PessoaTest {

    // Teste para validar o cálculo da idade
    @Test
    void validarCalculoDeIdade() {
        // Cria uma instância de Pessoa com o nome "Julia" e data de nascimento em 01 de janeiro de 2020 às 15:00
        Pessoa pessoa = new Pessoa("Julia", LocalDateTime.of(2020, 1, 1, 15, 0, 0));

        // Verifica se o método getIdade() retorna 4 para essa pessoa
        Assertions.assertEquals(4, pessoa.getIdade());
    }

    // Teste para verificar o cálculo correto da idade
    @Test
    void deveCalcularIdadeCorretamente() {
        // Cria uma instância de Pessoa com o nome "Jéssica" e data de nascimento em 01 de janeiro de 2000 às 15:00
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));

        // Verifica se o método getIdade() retorna 24 para essa pessoa
        Assertions.assertEquals(24, jessica.getIdade());
    }

    // Teste para verificar se a pessoa é maior de idade
    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        // Cria uma instância de Pessoa com o nome "Luan" e data de nascimento em 01 de janeiro de 2000 às 15:00
        Pessoa luan = new Pessoa("Luan", LocalDateTime.of(2000, 1, 1, 15, 0, 0));

        // Verifica se o método ehMaiorDeIdade() retorna verdadeiro para essa pessoa
        Assertions.assertTrue(luan.ehMaiorDeIdade());

        // Cria uma instância de Pessoa com o nome "João" e a data de nascimento como a data e hora atuais
        Pessoa joao = new Pessoa("João", LocalDateTime.now());

        // Verifica se o método ehMaiorDeIdade() retorna falso para essa pessoa
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
