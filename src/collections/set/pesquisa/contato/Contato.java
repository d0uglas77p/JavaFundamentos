package collections.set.pesquisa.contato;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numero;

    // Construtor para criar um novo objeto Contato com nome e número específicos
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Sobrescrevendo o método equals para comparar Contatos com base no nome
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica se é a mesma referência de objeto
        if (!(o instanceof Contato contato)) return false; // Verifica se o objeto é uma instância de Contato
        return Objects.equals(getNome(), contato.getNome()); // Compara os nomes dos contatos
    }

    // Sobrescrevendo o método hashCode para garantir consistência com o método equals
    @Override
    public int hashCode() {
        return Objects.hash(getNome()); // Gera um código hash baseado no nome do contato
    }

    // Sobrescrevendo o método toString para retornar uma representação em string do objeto Contato
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}