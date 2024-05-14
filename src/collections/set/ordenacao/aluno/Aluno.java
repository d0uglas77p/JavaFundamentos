package collections.set.ordenacao.aluno;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    // Atributos da classe Aluno
    private String nome;        // Nome do aluno
    private Long matricula;     // Número de matrícula do aluno
    private double media;       // Média do aluno

    // Construtor da classe Aluno
    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    // Métodos getters para os atributos
    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    // Método equals para comparar dois objetos Aluno com base na matrícula
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    // Método hashCode para gerar um código hash baseado na matrícula
    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    // Método compareTo para comparar dois objetos Aluno com base no nome (para ordenação natural)
    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }

    // Método toString para retornar uma representação em string do objeto Aluno
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}


