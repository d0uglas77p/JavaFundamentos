import org.example.EnviarMensagem;
import org.example.Mensagem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {

    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificaComportamentoDaClasse() {
        // Verifica se não houve interações com a instância de EnviarMensagem
        Mockito.verifyNoInteractions(enviarMensagem);

        // Cria uma mensagem simulada
        Mensagem mensagem = new Mensagem("Hello World");
        // Adiciona a mensagem à lista de mensagens da instância de EnviarMensagem
        enviarMensagem.adicionarMensagem(mensagem);

        // Verifica se o método adicionarMensagem foi chamado com a mensagem criada
        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        // Verifica se a lista de mensagens não está vazia
        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    }
}
