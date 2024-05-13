package collections.list.pesquisa;

// Classe para representar um livro com título, autor e ano de publicação.
public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor para inicializar um livro com título, autor e ano de publicação.
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos para obter título, autor e ano de publicação do livro.
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    // Sobrescrita do método toString para exibir detalhes do livro.
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}