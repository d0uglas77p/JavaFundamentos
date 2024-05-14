package collections.list.ordenacao.pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe para gerenciar e ordenar uma lista de pessoas.
public class OrdenacacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    // Método para adicionar uma pessoa à lista.
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    // Método para obter uma lista de pessoas ordenada por idade.
    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    // Método para obter uma lista de pessoas ordenada por altura.
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacacaoPessoa ordenacacaoPessoa = new OrdenacacaoPessoa();
        ordenacacaoPessoa.adicionarPessoa("Nome 1", 21, 161);
        ordenacacaoPessoa.adicionarPessoa("Nome 2", 22, 172);
        ordenacacaoPessoa.adicionarPessoa("Nome 3", 23, 183);
        ordenacacaoPessoa.adicionarPessoa("Nome 4", 24, 194);

        // Exibindo a lista original de pessoas
        System.out.println(ordenacacaoPessoa.pessoaList);

        // Ordenando e exibindo a lista de pessoas por idade
        System.out.println(ordenacacaoPessoa.ordenadoPorIdade());

        // Ordenando e exibindo a lista de pessoas por altura
        System.out.println(ordenacacaoPessoa.ordenarPorAltura());
    }
}
