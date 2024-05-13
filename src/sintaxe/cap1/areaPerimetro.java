package sintaxe.cap1;

import java.util.Scanner;

//calcular a area e o perimetro do retangulo
public class areaPerimetro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do retangulo: ");
        double largura = sc.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = largura * altura;
        System.out.printf("A area do retangulo é: %.2f\n", area);

        double perimetro = 2 * largura + 2 * altura;
        System.out.printf("O perimetro do retangulo é: %.2f\n", perimetro);
    }
}
