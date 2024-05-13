package poo.interfaces;

// Exemplo de uma interface em Java
public interface Animal {
    // Método abstrato para fazer um som
    void fazerSom();

    // Método abstrato para obter a descrição do animal
    String getDescricao();

    // Constante para definir o tipo de animal
    String TIPO = "Animal";
}


/*
A interface Animal define três elementos:

O método abstrato fazerSom(), que representa um comportamento genérico de fazer um som.
O método abstrato getDescricao(), que deve ser implementado por qualquer classe que implemente a interface Animal para fornecer uma descrição do animal.
A constante TIPO, que define o tipo de animal como uma constante public, static e final.
 */
