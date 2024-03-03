package poo.encapsulamento.construtor;

public class GenerateCaneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //GENERETE CONSTRUTOR
    public GenerateCaneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    //GENERATE GETT E SET
    public String getModelo() {
        return modelo;
    }

    //GENERATE GETT E SET
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //GENERATE GETT E SET
    public float getPonta() {
        return ponta;
    }

    //GENERATE GETT E SET
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    //GENERATE GETT E SET
    public String getCor() {
        return cor;
    }

    //GENERATE GETT E SET
    public void setCor(String cor) {
        this.cor = cor;
    }


    //MANUAL
    public void tampar () {
        this.tampada = true;
    }

    //MANUAL
    public void destampar () {
        this.tampada= true;
    }

    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("PONTA: " + this.getPonta());
        System.out.println("COR: " + this.getCor());
        System.out.println("TAMPADA: " + this.tampada);
    }
}
