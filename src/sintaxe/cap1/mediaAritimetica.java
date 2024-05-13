package sintaxe.cap1;

import java.util.Scanner;

public class mediaAritimetica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        double numero1 = sc.nextInt();

        System.out.println("Digite o número 2: ");
        double numero2 = sc.nextInt();

        System.out.println("Digite o número 3: ");
        double numero3 = sc.nextInt();

        double media;
        media = (numero1+numero2+numero3) / 3;
        System.out.printf("Número 1 = %.2f\n", numero1);
        System.out.printf("Número 2 = %.2f\n", numero2);
        System.out.printf("Número 3 = %.2f\n", numero3);

        System.out.printf("A media aritimetica é = %.2f", media);
    }

}
