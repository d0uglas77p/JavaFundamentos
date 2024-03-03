package poo.heranca;

//CLASSE MAIN PARA TESTE DA HERANÇA
public class Teste {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAlimenta("Todo animal se alimenta");
        animal.setLocomove("Todo animal se locomove");

        Cachorro cachorro = new Cachorro();
        cachorro.setAlimenta("Cachorro como ração de cachorro");
        cachorro.setLocomove("Cachorro usa 4 patas");
        cachorro.setLatido("Cachorro late");

        Animal poodle = new Animal();
        cachorro.setAlimenta("Poodle como ração de cachorro");
        cachorro.setLocomove("Poodle usa 4 patas");

    }

}
