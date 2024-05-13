package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

// Classe para gerenciar um catálogo de livros e fornecer métodos de pesquisa.
public class CatalogoLivros {

    private List<Livro> livroList; // Lista para armazenar os livros no catálogo.

    // Construtor para inicializar a lista de livros como ArrayList.
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    // Método para adicionar um novo livro ao catálogo.
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Método para pesquisar livros por autor.
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    // Método para pesquisar livros por intervalo de anos de publicação.
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    // Método para pesquisar um livro por título (retorna o primeiro encontrado ou null se não encontrado).
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break; // Interrompe o loop após encontrar o livro com o título correspondente.
                }
            }
        }
        return livroPorTitulo;
    }

    // Método principal para demonstrar o uso da classe CatalogoLivros.
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando alguns livros ao catálogo.
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2001);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2003);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2004);

        // Realizando algumas pesquisas nos livros do catálogo.
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2001, 2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));
    }
}
