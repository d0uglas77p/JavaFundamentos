package collections.comparableXcomparator;

import java.util.Comparator;

// Classe para comparar Livro por ano, autor e título utilizando Comparator
class CompararAnoAutorTitulo implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        // Comparação por ano
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0) {
            return ano; // Retorna a comparação por ano se for diferente de zero
        }

        // Comparação por autor se os anos forem iguais
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0) {
            return autor; // Retorna a comparação por autor se for diferente de zero
        }

        // Comparação por título se os anos e autores forem iguais
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}