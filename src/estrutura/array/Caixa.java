package estrutura.array;

public class Caixa {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[2];

        Produto prod1 = new Produto();
        prod1.setNome("Limão");
        prod1.setDescrcao("Galego");
        prod1.setValor(4);

        Produto prod2 = new Produto();
        prod2.setNome("Maça");
        prod2.setDescrcao("Gala");
        prod2.setValor(5);

        produtos[0] = prod1;
        produtos[1] = prod2;


        //parte 1
        //for(int i=0; i < produtos.length; i++) {
            //System.out.println(produtos[i].toString());
        //}

        //parte 2
        for (Produto prod: produtos) {
            System.out.println(prod.toString());
        }
    }
}
