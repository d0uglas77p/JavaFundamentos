package cap2;

public class OperadoresAritimeticos {
    public static void main (String[] args) {

        int x = 9;
        int y = 2;

        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        int divisao = x / y;
        int resto = x % y;

        System.out.println("Resultado da adição            " + soma);
        System.out.println("Resultado da subtracao         " + subtracao);
        System.out.println("Resultado da multiplicacao     " + multiplicacao);
        System.out.println("Resultado da divisao           " + divisao);
        System.out.println("Resultado do resto             " + resto);

        x++;
        System.out.println("Resultado do incremento x:     " + x);
        y--;
        System.out.println("Resultado do decremento x:     " + y);
        x += 10;
        System.out.println("Atribuição aditiva de x:       " + x);
        y -= 10;
        System.out.println("Atribuição subtrativa de x:    " + y);
    }
}
