import org.example.Conta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @Spy
    private Conta conta = new Conta(1000);

    @Test
    void validarOrdemDeChamadas() {
        // Chama o método pagaBoleto da conta
        conta.pagaBoleto(300);

        // Cria um objeto InOrder para verificar a ordem das chamadas
        InOrder inOrder = Mockito.inOrder(conta);
        // Verifica se o método pagaBoleto foi chamado primeiro
        inOrder.verify(conta).pagaBoleto(300);
        // Verifica se o método validaSaldo foi chamado em seguida
        inOrder.verify(conta).validaSaldo(300);
        // Verifica se o método debita foi chamado em seguida
        inOrder.verify(conta).debita(300);
        // Verifica se o método enviaCreditoParaEmissor foi chamado por último
        inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }

    @Test
    void validarQuantidadeDeChamadas() {
        // Chama o método validaSaldo três vezes com argumentos diferentes
        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        // Verifica se o método validaSaldo foi chamado exatamente 3 vezes com qualquer argumento
        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());
    }

}
