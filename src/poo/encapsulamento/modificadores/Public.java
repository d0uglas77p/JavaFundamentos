package poo.encapsulamento.modificadores;

/*
O modificador public é o mais permissivo e permite que uma classe, método ou atributo seja acessado de qualquer lugar,
ou seja, por qualquer outra classe ou pacote.
 */

public class Public {
    public int meuMetodo() {
        return 42;
    }
}

/*
Para Classe: Uma classe declarada como public pode ser acessada por qualquer outra classe em qualquer pacote.
Para Métodos e Atributos: Um método ou atributo declarado como public pode ser acessado por qualquer outra classe em qualquer pacote.
 */