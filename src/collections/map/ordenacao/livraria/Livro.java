package collections.map.ordenacao.livraria;

import java.util.Comparator;
import java.util.Map;

// Definição da classe Livro
public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    // Construtor da classe Livro
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Método para obter o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Método para obter o autor do livro
    public String getAutor() {
        return autor;
    }

    // Método para obter o preço do livro
    public double getPreco() {
        return preco;
    }

    // Método toString para representar o objeto Livro como uma string
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}

