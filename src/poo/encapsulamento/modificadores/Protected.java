package poo.encapsulamento.modificadores;

/*
O modificador protected permite que uma classe, método ou atributo seja acessado por classes no mesmo pacote
ou por subclasses (mesmo que estejam em pacotes diferentes).
 */

public class Protected {

    public class Animal {
        protected String nome;

        protected void fazerSom() {
            System.out.println("Animal fazendo som");
        }
    }

    public class Cachorro extends Animal {
        public Cachorro(String nome) {
            this.nome = nome;
        }

        public void latir() {
            System.out.println(nome + " está latindo!");
        }
    }
}

/*
Para Classes: Não é comum declarar uma classe como protected. Classes têm escopo de pacote ou podem ser public.
Para Métodos e Atributos: Um método ou atributo declarado como protected pode ser acessado por classes no mesmo pacote
ou por subclasses, independentemente do pacote em que a subclasse está localizada.
 */
