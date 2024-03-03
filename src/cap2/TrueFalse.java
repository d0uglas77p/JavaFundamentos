package cap2;

public class TrueFalse {

    /*
    public static void main (String[] args) {

      int idade = 18;
      boolean maioridade = idade >= 18;

        System.out.println(maioridade);
    }
    */

    public static void main (String[] args){

        int idade = 18;

    //    boolean precisaVotar = idade >= 18  && idade <= 70; //and &&
    //    boolean precisaVotar = idade < 18 || idade > 70;   //or ||
        boolean precisaVotar = !(idade >= 18);               //not !

        System.out.println(precisaVotar);

    }
}
