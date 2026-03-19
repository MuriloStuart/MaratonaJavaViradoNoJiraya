package projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Teste;

import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Computador;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Televisao;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Tomate;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",11000);
        Tomate tomate = new Tomate("Tomate ciciliano", 10);
        Televisao tv = new Televisao("Sansung 50\" ",5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
