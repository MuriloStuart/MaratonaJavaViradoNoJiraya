package projectsidea.devdojo.maratonajava.java.core.Gassociacao.Exercicio.Dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;

    public void imprime(){
        int contador = 1;
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios == null) {
            System.out.println("Professor não tem seminario");
        } else {
            for (Seminario seminario : seminarios) {
                System.out.println("Seminario: " + contador);
                System.out.println(seminario.getTitulo());
                contador++;
            }

        }
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
