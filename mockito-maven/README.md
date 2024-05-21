# Mockito

Mockito é um popular framework de teste de unidade para Java, usado para criar testes de comportamento através da simulação (mocking) de objetos. Com Mockito, os desenvolvedores podem testar partes isoladas do código, simulando dependências e verificando as interações entre os objetos. Isso facilita a criação de testes mais robustos e específicos, assegurando que o código funcione conforme esperado.

## Principais Funcionalidades

1. **Criação de Mocks**:
   - Simula objetos que são dependências das classes em teste.
   - Permite configurar o comportamento dos mocks para retornar valores específicos ou lançar exceções.

2. **Verificação de Interações**:
   - Verifica se métodos em objetos mock foram chamados com parâmetros específicos.
   - Verifica a ordem e a quantidade de chamadas aos métodos.

3. **Captura de Argumentos**:
   - Captura os argumentos passados para os métodos de objetos mock para verificações mais detalhadas.

4. **Integração com JUnit e TestNG**:
   - Facilmente integrável com frameworks de teste populares como JUnit e TestNG.

## Exemplo de Uso

Aqui está um exemplo básico de como usar Mockito em um teste unitário:

### Dependências

Adicione a dependência do Mockito ao seu projeto. Se estiver usando Maven, adicione ao seu `pom.xml`:

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>5.11.0</version>
    <scope>test</scope>
    </dependency>
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>4.0.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-inline</artifactId>
    <version>4.4.0</version>
    <scope>test</scope>
</dependency>
```

## Exemplo de Código

```java
import org.example.Email;
import org.example.Formato;
import org.example.PlataformaDeEnvio;
import org.example.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma() {
        String enderecoDeEmail = "douglas@gemail.com";
        String mensagem = "Olá, tudo bem?";
        boolean ehFormatoHtml = true;

        servico.enviaEmail(enderecoDeEmail, mensagem, ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());
    }
}
```

## Explicação do Código

- `@ExtendWith(MockitoExtension.class)`: Habilita a extensão do Mockito para JUnit 5.
- `@Mock`: Cria um mock para a interface `PlataformaDeEnvio`.
- `@InjectMocks`: Injeta os mocks na classe `ServicoEnvioEmail`.
- `@Captor`: Captura argumentos passados para métodos dos mocks.
- `Mockito.verify(plataforma).enviaEmail(captor.capture())`: Verifica se o método `enviaEmail` foi chamado e captura o argumento passado.
- `Assertions.assertEquals(...)`: Verifica se os dados capturados estão corretos.

## Recursos Adicionais

- [Documentação Oficial do Mockito](https://site.mockito.org/)
- [Repositório no GitHub](https://github.com/mockito/mockito)
- [Fonte de estudos oferecido pela DIO](https://github.com/willyancaetano/mockito-exemplos)

