import org.example.Email;
import org.example.Formato;
import org.example.PlataformaDeEnvio;
import org.example.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;

// Importação da extensão do Mockito para JUnit 5
import org.mockito.junit.jupiter.MockitoExtension;

// Anotação para habilitar o uso do Mockito com JUnit 5
@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    // Criação de um mock para PlataformaDeEnvio
    @Mock
    private PlataformaDeEnvio plataforma;

    // Injeção de dependências do mock para a classe de serviço sob teste
    @InjectMocks
    private ServicoEnvioEmail servico;

    // Captura de argumentos para o mock
    @Captor
    private ArgumentCaptor<Email> captor;

    // Teste para validar se os dados são enviados corretamente para a plataforma
    @Test
    void validarDadosEnviadosParaPlataforma() {
        // Definição dos dados de entrada
        String enderecoDeEmail = "douglas@gemail.com";
        String mensagem = "Olá, tudo bem?";
        boolean ehFormatoHtml = true;

        // Chamada do método sob teste
        servico.enviaEmail(enderecoDeEmail, mensagem, ehFormatoHtml);

        // Verificação se o método enviaEmail() da plataforma foi chamado com o argumento correto
        Mockito.verify(plataforma).enviaEmail(captor.capture());

        // Captura do argumento passado para o método enviaEmail()
        Email emailCapturado = captor.getValue();

        // Verificação dos dados capturados
        Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());
    }
}
