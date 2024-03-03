package poo.encapsulamento.getset;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta(); //Criando uma nova caneta

        //C1 é a nova caneta
        //setModelo está passando um parametro(MODELO) a essa nova caneta
        c1.setModelo("bic");
        //c1.modelo = "bic"; <- MODELO tem o acesso privadoda classe Caneta

        //C1 é a nova caneta
        //setPonta está passando um parametro(PONTA) a essa nova caneta
        c1.setPonta(0.5f);
        //c1.Ponta = 0.5f; <- PONTA tem o acessa privado da classe Caneta

        //System.out.println("TENHO UMA CANETA: " + c1.modelo); <-- MODELO é privado
        System.out.println("TENHO UMA CANETA: " + c1.getModelo()); // <- getModelo() é publico e pegou o MODELO que era privado
    }
}

// O METODO GET E O SET VAI "PROTEGER" O ATRIBUTO QUE É PRIVADO
// getter = pegar, acessar
// setter = entregar, passar e passar "+1 objeto"

// get é usado para métodos de leitura (obter valores).
// set é usado para métodos de escrita (definir valores).
// Essa prática ajuda a manter o código claro e compreensível.


