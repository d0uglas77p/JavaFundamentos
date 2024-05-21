import org.example.ApiDosCorreios;
import org.example.CadastrarPessoa;
import org.example.DadosLocalizacao;
import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {
        // Criação de um objeto DadosLocalizacao simulado
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "Mogi das Cruzes", "Rua Principal","Casa", "Centro");

        // Configuração do comportamento simulado da apiDosCorreios
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("987654321")).thenReturn(dadosLocalizacao);

        // Chamada do método cadastrarPessoa da classe CadastrarPessoa
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Douglas", "123456789", LocalDate.now(), "987654321");

        // Verificações dos resultados esperados
        Assertions.assertEquals("Douglas", pessoa.getNome());
        Assertions.assertEquals("123456789", pessoa.getDocumento());
        Assertions.assertEquals("SP", pessoa.getEndereco().getUf());
        Assertions.assertEquals("Casa", pessoa.getEndereco().getComplemento());
    }
}
