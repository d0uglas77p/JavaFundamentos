package sintaxe.cap1;

import java.util.Scanner;

//porcentual aumento de salario
public class aumentoSalarial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario atual do funcionário: ");
        double salarioAtual = sc.nextDouble();

        System.out.println("Digite o porcentual aumento de salário do funcionario: ");
        double salarioAumento = sc.nextDouble();

        double aumento;
        aumento = salarioAtual * (salarioAumento/100);

        double novoSalario;
        novoSalario = salarioAtual + aumento;

        String R$ = "R$";

        System.out.printf("O salário atual do funcionario é: %s %.2f\n", R$,salarioAtual);
        System.out.printf("Aumento porcentual do funcionario é: %s %.2f\n", R$,salarioAumento);
        System.out.printf("Novo salário do funcionário é: %s %.2f", R$,novoSalario);

    }


}
