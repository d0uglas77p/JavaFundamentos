package poo.encapsulamento.modificadores;

/*
O modificador private restringe o acesso a uma classe, método ou atributo somente à própria classe em que foram declarados.
Isso significa que esses elementos não podem ser acessados por outras classes, mesmo que estejam no mesmo pacote
 */

public class Private {
    private int numeroSecreto = 123;

    private void imprimirNumeroSecreto() {
        System.out.println(numeroSecreto);
    }
}

/*
Para Classes: Não é possível declarar uma classe como private. Classes têm escopo de pacote ou podem ser public.
Para Métodos e Atributos: Um método ou atributo declarado como private só pode ser acessado dentro da própria classe onde foi declarado.
 */

