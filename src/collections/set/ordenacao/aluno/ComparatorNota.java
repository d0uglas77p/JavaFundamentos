package collections.set.ordenacao.aluno;

import java.util.Comparator;

// Classe ComparatorNota para comparar Alunos com base na média
class ComparatorNota implements Comparator<Aluno> {
    // Método compare para comparar dois objetos Aluno com base na média
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}