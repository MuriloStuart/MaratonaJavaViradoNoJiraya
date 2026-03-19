package projectsidea.devdojo.maratonajava.java.core.Lclassesabstratas.teste;

import projectsidea.devdojo.maratonajava.java.core.Lclassesabstratas.dominio.Desenvolvedor;
import projectsidea.devdojo.maratonajava.java.core.Lclassesabstratas.dominio.Funcionario;
import projectsidea.devdojo.maratonajava.java.core.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente =new Gerente("Nami", 5000);
        Desenvolvedor dev = new Desenvolvedor("Touya",12000);

        System.out.println(gerente);
        System.out.println(dev);
        gerente.imprime();
        dev.imprime();
    }
}
