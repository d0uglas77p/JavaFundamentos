package sintaxe.cap1;

// mostre a área e o prímetro de uma circunferência
public class circunferencia {

    public static void main(String[] args) {

        double raio = 4.5;
        double pi = 3.14;
        double area;
        double perimetro;

        /*area = pi * raio ** 2;
        System.out.println("A area da circunferencia é = " + area);*/

        perimetro =  2 * pi * raio;
        System.out.println("O perimetro da circunferencia é = " + perimetro);

    }

}
