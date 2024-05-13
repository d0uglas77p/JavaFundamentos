package sintaxe.cap2;

public class Imc {

    /*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();

        double result = peso / (altura * altura);
        System.out.printf("Resultado IMC: %.2f\n" , result);

        if (result >= 18.5 && result <= 25) {
            System.out.println("Peso ideal!");
        } else {
            System.out.println("Fora do peso normal!");
        }
    }*/

    public static void main(String[] args) {

        double peso = 100;
        double altura = 1.80;
        double result;

        result = peso / (altura * altura);
        System.out.printf("Resultado IMC: %.2f\n" , result);

        if (result >= 18.5 && result <= 25){
            System.out.println("Peso ideal!");
        } else {
            System.out.println("Fora do peso normal!");
        }
    }
}
