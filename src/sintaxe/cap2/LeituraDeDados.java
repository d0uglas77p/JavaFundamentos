package sintaxe.cap2;

import java.util.Scanner;

public class LeituraDeDados {

    public static void main (String[] args) {

        /*
        System.out.println("eu pulo linha ");
        System.out.print("eu não pulo linha ");
        System.out.print("eu não pulo linha ");
         */

        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt(); // next() lê um número inteiro
        double preco = sc.nextDouble(); // next() lê um número de ponto flutuante

        System.out.println("Idade digitada: " + idade);
        System.out.println("Idade digitada: " + preco);
        sc.close();
    }

}
