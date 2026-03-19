package projectsidea.devdojo.maratonajava.java.core.Gassociacao.teste;

import projectsidea.devdojo.maratonajava.java.core.Gassociacao.dominio.Escola;
import projectsidea.devdojo.maratonajava.java.core.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraiya");
        Professor professor2 = new Professor("Kakashi");
        Professor [] professores = {professor1,professor2};
        Escola escola = new Escola("Konoha",professores);
        escola.imprime();
    }
}
