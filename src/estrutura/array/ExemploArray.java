package estrutura.array;

public class ExemploArray {
    public static void main(String[] args) {
        // Declarando e inicializando um array de inteiros
        int[] numeros = new int[5]; // Array de tamanho 5

        // Atribuindo valores ao array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acessando e imprimindo elementos do array
        System.out.println("Elemento na posição 1: " + numeros[0]);
        System.out.println("Elemento na posição 2: " + numeros[1]);
        System.out.println("Elemento na posição 3: " + numeros[2]);
        System.out.println("Elemento na posição 4: " + numeros[3]);
        System.out.println("Elemento na posição 5: " + numeros[4]);
    }
}
