import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTest {

    // Criação de um mock para a interface List<String>
    @Mock
    private List<String> letras;

    // Método de teste para adicionar um item à lista
    @Test
    void adicionarItemNaLista() {
        // Configura o comportamento do mock: quando o método get(0) for chamado, retorne "B"
        Mockito.when(letras.get(0)).thenReturn("B");

        // Verifica se o valor retornado pelo método get(0) da lista é "B"
        Assertions.assertEquals("B", letras.get(0));
    }
}
