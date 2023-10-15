package List.Pesquisa;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPuclicacao;

    public Livro(String titulo, String autor, int anoPuclicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPuclicacao = anoPuclicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPuclicacao() {
        return anoPuclicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPuclicacao=" + anoPuclicacao +
                '}';
    }

}
