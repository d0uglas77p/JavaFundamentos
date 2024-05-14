package collections.set.operacoes.convidado;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvite;

    // Construtor para criar um novo objeto Convidado com nome e código de convite específicos
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Sobrescrevendo o método equals para comparar Convidados com base no código de convite
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica se é a mesma referência de objeto
        if (!(o instanceof Convidado convidado)) return false; // Verifica se o objeto é uma instância de Convidado
        return getCodigoConvite() == convidado.getCodigoConvite(); // Compara os códigos de convite
    }

    // Sobrescrevendo o método hashCode para garantir consistência com o método equals
    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite()); // Gera um código hash baseado no código de convite
    }

    // Sobrescrevendo o método toString para retornar uma representação em string do objeto Convidado
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
