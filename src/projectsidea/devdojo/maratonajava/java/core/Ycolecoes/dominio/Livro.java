package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if(this.getClass() != obj.getClass()) return false;
        Livro other = (Livro) obj;
        return isbn != null && isbn.equals(other.isbn);
    }
}
