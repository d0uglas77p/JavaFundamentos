package estrutura.repeticao.whilee;

public class Caixa {

    public static void main(String[] args) {

        int qtdProdutos = 5;
        int registro = 0;

        while (registro < qtdProdutos) {
            registro++;
            System.out.println("O produto número " + registro + "foi registrado");
        }
    }

}

/*
O  loop  WHILE  executa  um  bloco  de  código  enquanto  a  condição  for verdadeira.
Perceba que o loop while nunca será executado se a condição for false desde o início.
 */
