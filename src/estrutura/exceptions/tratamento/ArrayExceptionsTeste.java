package estrutura.exceptions.tratamento;

public class ArrayExceptionsTeste {
    public static void main(String[] args) {

        // Cria um array de inteiros com tamanho 2
        // Aqui, você está tentando atribuir o valor 10 à posição de índice 2 no array,
        // mas o array foi criado com tamanho 2 (índices 0 e 1).
        int[] array = new int[2];

        try {
            // Tenta acessar uma posição inexistente do vetor
            array[2] = 10;

            // Captura a exceção quando ultrapassa os "limites do array".
        } catch (ArrayIndexOutOfBoundsException e) {
            // e.getMessage() é usado para obter a mensagem associada à exceção
            System.err.println("Mensagem de erro: " + e.getMessage());
            // imprime a pilha de chamadas (stack trace) associada à exceção.
            // O stack trace mostra a sequência de chamadas de método que levou à exceção.
            e.printStackTrace();
        }
    }
}
