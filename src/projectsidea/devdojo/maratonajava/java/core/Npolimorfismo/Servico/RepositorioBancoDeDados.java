package projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Servico;

import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
