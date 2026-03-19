package projectsidea.devdojo.maratonajava.java.core.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Equipe equipe;

    public void imprime() {
        System.out.println(this.nome);
        if (equipe != null) {
            System.out.println(equipe.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
