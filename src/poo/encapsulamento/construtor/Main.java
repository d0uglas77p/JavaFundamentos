package poo.encapsulamento.construtor;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "AZUL", 0.4f );
        c1.status();
        Caneta c2 = new Caneta("GENERICO", "PRETO", 0.8f);
        c2.status();
    }
}
