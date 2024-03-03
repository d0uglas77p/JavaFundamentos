package estrutura.exceptions.tratamento;

import java.util.Scanner;

public class ArithmeticExceptionTeste {
    public static void main(String[] args) {
        // Cria um objeto Scanner para a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê os dois números
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        try {
            // Realiza a divisão
            int divisao = numero1 / numero2;
            // Exibe o resultado
            System.out.println("O resultado é: " + divisao);

            // Captura a exceção caso ocorra uma divisão por zero
        } catch (ArithmeticException e) { // O 'e' após ArithmeticException é uma convenção comum para nomear a variável que representa a instância da exceção capturada.

            System.err.println("Erro ao dividir!"); // O método System.err.println() é utilizado para imprimir
            // mensagens de erro no console em Java, dentro do bloco catch.
            // geralmente aparece em vermelho no console para chamar a atenção do desenvolvedor
        }
        sc.close();
    }
}
