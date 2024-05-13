package poo.polimorfismo;

public class CalculadoraOverloading {

    // Método para somar dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para somar três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para somar dois números em ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }
}

/* a classe Calculadora possui três métodos somar, cada um com uma lista de parâmetros diferente.
Isso ilustra a sobrecarga de métodos, onde o método apropriado será chamado com base nos argumentos passados.
 */
