package poo.polimorfismo;

class Animal {
    public void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}

/*
Cachorro e Gato são subclasses da classe Animal.
Ambas as subclasses sobrescrevem o método fazerSom() da classe Animal com suas próprias implementações específicas (Au au! para Cachorro e Miau! para Gato).
Quando chamamos fazerSom() em uma instância de Cachorro ou Gato, a implementação correta do método é selecionada em tempo de execução com base no tipo de objeto.
 */