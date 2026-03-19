package projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Servico;

import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria  implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}
