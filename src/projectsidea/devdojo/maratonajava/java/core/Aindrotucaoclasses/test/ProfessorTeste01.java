package projectsidea.devdojo.maratonajava.java.core.Aindrotucaoclasses.test;

import projectsidea.devdojo.maratonajava.java.core.Aindrotucaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 21;
        professor.name = "Murilo";
        professor.sexo = 'M';

        System.out.println(professor.name + " " + professor.sexo + " "+ professor.idade);
    }
}
