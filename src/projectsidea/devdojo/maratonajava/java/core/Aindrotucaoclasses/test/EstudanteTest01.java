package projectsidea.devdojo.maratonajava.java.core.Aindrotucaoclasses.test;

import projectsidea.devdojo.maratonajava.java.core.Aindrotucaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
       Estudante estudante = new Estudante();
       estudante.nome = "Murilo";
       estudante.sexo = 'M';
       estudante.idade = 25;

        System.out.print(estudante.nome + "\n" +estudante.sexo + "\n" + estudante.idade);
    }
}
