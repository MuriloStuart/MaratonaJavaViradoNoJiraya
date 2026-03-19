package projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.teste;

import projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio.Estudante;

public class impressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("--------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
