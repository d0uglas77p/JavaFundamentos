package poo.heranca;

/*

Uma classe que herda de outra classe é chamada de subclasse, já a classe herdada é chamada de superclasse.
Uma classe só pode ter uma superclasse, ou seja, não é possível ter herança múltipla.
Porém, uma classe pode ter um número ilimitado de subclasses.
Dessa forma, uma subclasse recebe todas as características da superclasse e de todas as outras classes acima dela.


EXTENDS: é  utilizada  na  declaração  de  uma  classe  para determinar a sua superclasse.


@OVERRIDE: é usada para indicar que um método na subclasse está sendo sobrescrito a partir de uma classe pai (superclasse).
Fornece uma indicação ao compilador de que a intenção é sobrescrever um método da superclasse.
Se, por algum motivo, o método na subclasse não estiver realmente sobrescrevendo um método existente na superclasse, o compilador emitirá um erro.

class Animal {
    public void fazerSom() {
        System.out.println("Algum som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override <------------ SOBREESCRITA DO METODO IGUAL AO DA SUPERCLASSE
    public void fazerSom() {
        System.out.println("Latindo...");
    }
}


SUPER(): A palavra-chave super em Java é usada para referenciar membros da classe pai (superclasse).
Ela pode ser usada para chamar o construtor da classe pai, acessar métodos e variáveis da superclasse.
Quando você chama super() dentro do construtor de uma subclasse, está chamando o construtor da superclasse.
Isso é comumente usado para inicializar os membros herdados da superclasse antes de inicializar os membros específicos da subclasse.
A chamada para super() deve ser a primeira instrução no construtor da subclasse.

class Animal {
    private String nome;

    public Animal(String nome) { <--- CONSTRUTOR DA SUPERCLASSE ANIMAL
        this.nome = nome;
    }

class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) { <--- CONSTRUTOR DA SUBCLASSE
        super(nome);  <--- Chamando o construtor da classe Animal
        this.raca = raca;
    }

 */