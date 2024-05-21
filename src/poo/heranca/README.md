# Programação Orientada a Objetos: Herança

Este projeto demonstra conceitos básicos de herança na programação orientada a objetos em Java, incluindo o uso de `extends`, `@Override` e `super()`. 

## Estrutura do Projeto

O projeto consiste em uma hierarquia de classes que exemplificam como uma subclasse pode herdar de uma superclasse e sobrescrever métodos.

### Classes

- **Animal**
  ```java
  public class Animal {
    private String nome;

    public Animal(String nome) {  // Construtor da Superclasse
      this.nome = nome;
      }

    public void fazerSom() {
      System.out.println("Algum som genérico de animal");
      }
  }

  - **Cachorro** 
    ```java
    package poo.heranca;

    public class Cachorro extends Animal {
    private String raca;

      public Cachorro(String nome, String raca) {  // Construtor da Subclasse
        super(nome);  // Chamando o construtor da classe Animal
          this.raca = raca;
      }

      @Override
      public void fazerSom() {
        System.out.println("Latindo...");
      }
    }

## Herança
Uma classe que herda de outra classe é chamada de subclasse, enquanto a classe herdada é chamada de superclasse. Uma subclasse herda todas as características da superclasse.
  ``` java
  class Cachorro extends Animal {
    // A subclasse Cachorro herda de Animal
  }
  ```
#

## @Override
A anotação @Override é usada para indicar que um método na subclasse está sobrescrevendo um método da superclasse. Se o método na subclasse não estiver sobrescrevendo corretamente, o compilador emitirá um erro.

  ``` java
  @Override
  public void fazerSom() {
    System.out.println("Latindo...");
  }
  ```
#

## super()
A palavra-chave super é usada para referenciar membros da superclasse. Pode ser utilizada para chamar o construtor da superclasse, acessar métodos e variáveis da superclasse.

  ``` java
  public Cachorro(String nome, String raca) {
    super(nome);  // Chamando o construtor da superclasse
    this.raca = raca;
  }
