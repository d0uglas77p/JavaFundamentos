package collections.set.ordenacao.produto;

import java.util.Comparator; // Importa a interface Comparator para implementar a comparação personalizada

public class ComparatorPorPreco implements Comparator<Produto> {

    // Método de comparação sobrescrito da interface Comparator
    @Override
    public int compare(Produto p1, Produto p2) {
        // Compara os preços dos produtos p1 e p2 usando Double.compare
        // Retorna um valor negativo se p1 < p2, zero se p1 == p2, ou positivo se p1 > p2
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
