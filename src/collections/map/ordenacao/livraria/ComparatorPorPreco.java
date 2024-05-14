package collections.map.ordenacao.livraria;

import java.util.Comparator;
import java.util.Map;

// Classe ComparatorPorPreco para comparar livros por preço
class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}