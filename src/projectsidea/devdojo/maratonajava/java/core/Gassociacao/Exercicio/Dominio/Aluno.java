package projectsidea.devdojo.maratonajava.java.core.Gassociacao.Exercicio.Dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (seminario != null){
            System.out.println(seminario.getTitulo());
        } else {
            System.out.println("Esse aluno não está em um semínario");
        }
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
