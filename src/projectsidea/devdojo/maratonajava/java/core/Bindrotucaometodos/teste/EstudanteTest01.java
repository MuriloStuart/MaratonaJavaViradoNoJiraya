package projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.teste;

import projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio.Estudante;
import projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante01.nome = "Midoryra";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Murilo";
        estudante02.idade = 22;
        estudante02.sexo = 'M';



        impressora.imprime(estudante01);
        impressora.imprime(estudante02);





    }
}
