package estrutura.exceptions;


/*
Checked: exceção que deve ser tratada ou relançada pelo desenvolvedor, geralmente herda da classe Exception.

Unchecked: exceção que pode ser tratada ou relançada pelo programador. Essa exceção é gerada pelo código mal escrito,
caso a exceção não for tratada, ela será automaticamente relançada. Geralmente esse tipo de exceção herda de RuntimeException.

Error: erro crítico, utilizado pela JVM para indicar que existe um problema que não permite a execução do programa continuar.


THROWABLE: é a classe base para todas as classes que representam erros ou exceções que podem ser lançadas durante a execução de um programa.
A classe THROWABLE possui duas subclasses principais:
Error (para erros graves e irrecuperáveis)
Exception (para exceções que podem ser tratadas).

EX: Se você deseja criar uma exceção personalizada, seria mais apropriado estender a classe Exception
ou uma de suas subclasses ao utilizar a exceção ArithmeticException.

metodos da classe:

    printStackTrace() – imprime a pilha de erro encontrada na exceção, nesta pilha,
    podemos verificar o número da linha e classe onde a exceção foi gerada;

    getMessage() – retorna uma mensagem contento a lista de erros armazenadas em uma exceção.



TRY: O bloco try possui o código que pode gerar uma exceção, ou seja, este trecho de código será monitorado pela JVM.
Se um erro for gerado, o fluxo da execução é desviado para o bloco catch, para o tratamento do erro.

CATCH: O bloco catch só é executado se uma exceção for gerada. Caso nenhuma exceção seja lançada, a execução pula o bloco
catch e continua normalmente. Se uma exceção for lançada, o bloco try é finalizado e o fluxo de execução procura por
um bloco catch adequado para tratar a exceção, depois de executar o bloco catch, a execução continua na primeira instrução
após o último bloco catch.

Se nenhum catch conseguir capturar a exceção lançada, ela não será tratada, como se não existisse o bloco try-catch.

 */