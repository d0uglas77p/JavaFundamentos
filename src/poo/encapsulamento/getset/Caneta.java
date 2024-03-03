package poo.encapsulamento.getset;

public class Caneta {
    private String modelo; //MODELO PRIVADO
    private float ponta; //PONTA PRIVADO


    //getModelo() usado para acessar atributo privado da classe Caneta
    public String getModelo() {
        return this.modelo; // this.modelo refere-se à instância atual objeto objeto.
        //retornará uma string, que é o valor armazenado no atributo modelo.
    }

    //setModelo() usado para modificar atributo privado da classe Caneta
    //método recebe um parâmetro m do tipo String e o utiliza para definir o valor do atributo privado modelo.
    public void setModelo(String m) { //void indica que o método não retorna nenhum valor.
        this.modelo = m; // this.modelo refere-se à instância atual objeto objeto.
    }

    //getPonta() usado para acessar atributo pribado da classe Caneta
    public float getPonta() {
        return this.ponta; // this.modelo refere-se à instância atual objeto objeto.
        //retornará um float, que é o valor armazenado no atributo modelo.
    }

    //setPonta() usado para modificar atributo privado da classe Caneta
    //método recebe um parâmetro p do tipo float e o utiliza para definir o valor do atributo privado ponta.
    public void setPonta(float p) { //void indica que o método não retorna nenhum valor.
        this.ponta = p; // this.modelo refere-se à instância atual objeto objeto.
    }

    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("MODELO: " + getModelo());
        System.out.println("PONTA: " + getPonta());
    }
}
