package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nomeManga;
    private double precoManga;
    private int quantidade;

    public Manga(Long id, String nomeManga, double precoManga) {
        Objects.requireNonNull(id, "ID não pode ser nulo.");
        Objects.requireNonNull(nomeManga, "nomeManga não pode ser nulo.");
        this.id = id;
        this.nomeManga = nomeManga;
        this.precoManga = precoManga;
    }

    public Manga(Long id, String nomeManga, double precoManga, int quantidade) {
        this(id, nomeManga, precoManga);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(precoManga, manga.precoManga) == 0 && Objects.equals(id, manga.id) && Objects.equals(nomeManga, manga.nomeManga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeManga, precoManga);
    }


    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", precoManga=" + precoManga +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeManga() {
        return nomeManga;
    }

    public void setNomeManga(String nomeManga) {
        this.nomeManga = nomeManga;
    }

    public double getPrecoManga() {
        return precoManga;
    }

    public void setPrecoManga(double precoManga) {
        this.precoManga = precoManga;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negativo se this < 0
        // se this == outroManga, return 0
        // positivo se this > outroManga

//        if(this.id < outroManga.getId()) return -1;
//        if(this.id.equals(outroManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        return this.nomeManga.toUpperCase().compareTo(outroManga.nomeManga.toUpperCase());
        //return Double.compare(precoManga, outroManga.precoManga);
        //return this.id.compareTo(outroManga.id);
    }
}
