package projectsidea.devdojo.maratonajava.java.core.Gassociacao.Exercicio.Teste;

import projectsidea.devdojo.maratonajava.java.core.Gassociacao.Exercicio.Dominio.Aluno;
import projectsidea.devdojo.maratonajava.java.core.Gassociacao.Exercicio.Dominio.Local;
import projectsidea.devdojo.maratonajava.java.core.Gassociacao.Exercicio.Dominio.Professor;
import projectsidea.devdojo.maratonajava.java.core.Gassociacao.Exercicio.Dominio.Seminario;

public class TesteExercicio01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Murilo", 22);
        Aluno aluno2 = new Aluno("Maria", 25);
        Aluno aluno3 = new Aluno("Joao", 28);
        Professor professor = new Professor("Marcos", "Fisica");
        Aluno[] alunos = {aluno, aluno2, aluno3};

        Seminario seminario = new Seminario("Bolsa");
        Seminario seminario2 = new Seminario("Barça");
        Seminario seminario3 = new Seminario("Real",alunos);
        Local local1 = new Local("Rua das Marias");
        Local local2 = new Local("Rua das Vivi");
        Local local3 = new Local("Rua do João");
        seminario.setAlunos(alunos);
        aluno.setSeminario(seminario2);
        Seminario [] seminarios = {seminario,seminario2,seminario3};

        professor.setSeminarios(seminarios);
        //professor.imprime();
        seminario.setLocal(local1);
        seminario2.setLocal(local1);
        seminario3.setLocal(local1);
        //seminario.imprime();
        //seminario2.imprime();
        seminario3.imprime();
        //aluno.imprime();
    }
}
