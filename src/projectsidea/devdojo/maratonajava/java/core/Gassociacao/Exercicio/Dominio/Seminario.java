package projectsidea.devdojo.maratonajava.java.core.Gassociacao.Exercicio.Dominio;

public class Seminario {
    private String titulo;
    private Aluno [] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public void imprime() {
        int contador = 1;
        System.out.println("Titulo: " + this.titulo);
        if (alunos == null) {
            System.out.println("Não há alunos cadastrados");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("Aluno:" + contador);
                System.out.println(aluno.getNome());
                System.out.println(aluno.getIdade());
                contador++;
            }
        }
        if (local != null) {
            System.out.println(local.getEndereco());
        } else {
            System.out.println("Não há endereço cadastrado");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
