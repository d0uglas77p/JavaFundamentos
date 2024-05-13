package poo.interfaces;

// Para implementar uma interface em uma classe, utilizamos a palavra-chave implements.
public class Cachorro implements Animal {
    // Implementação do método fazerSom para um cachorro
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }

    // Implementação do método getDescricao para um cachorro
    @Override
    public String getDescricao() {
        return "Cachorro doméstico";
    }
}

/*
Cachorro implementa a interface Animal e fornece implementações para os métodos abstratos fazerSom() e getDescricao().
A implementação de fazerSom() faz com que o cachorro emita o som "Au au!", e getDescricao() retorna uma descrição específica para um cachorro.
 */
