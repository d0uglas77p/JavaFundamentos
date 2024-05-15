package collections.comparableXcomparator;

import java.util.Comparator;

// Classe para comparar Livro por ano utilizando Comparator
class CompararAno implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
    }
}