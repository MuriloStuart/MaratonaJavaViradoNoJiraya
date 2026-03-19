package projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Teste;

import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Servico.RepositorioArquivo;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Servico.RepositorioBancoDeDados;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Servico.RepositorioMemoria;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.repositorio.Repositorio;

public class RepositorioTeste {
    public static void main(String[] args) {
        //RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
        //repositorioBancoDeDados.salvar();
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
