package collections.list.ordenacao;

import java.util.Comparator;

// Classe ComparatorPorAltura implementa Comparator para ordenar pessoas por altura.
public class ComparatorPorAltura implements Comparator<Pessoa> {
    // Método compare para ordenar pessoas por altura.
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
