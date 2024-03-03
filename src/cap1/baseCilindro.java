package cap1;

import java.util.Scanner;

//Mostre o volume de um cilindro
public class baseCilindro {

    public static void main(String[] args) {

        double volume;
        double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio da base do cilindro: ");
        double raio = sc.nextDouble();

        //volume = pi * raio **2;
        //System.out.printf("o volume do cilindro é = %.2f", volume);
    }
}
