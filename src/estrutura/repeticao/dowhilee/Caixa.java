package estrutura.repeticao.dowhilee;

public class Caixa {

    public static void main(String[] args) {

        int qtdProdutos = 5;
        int registro = 0;

        do  {
            registro++;
            System.out.println("O produto número " + registro + " foi registrado");
        } while (registro < qtdProdutos);
    }

}

/*
O loop DO WHILE primeiramente irá executar todo o bloco de código para depois testar a condição.
E assim verificar se repete novamente o bloco de código
 */
