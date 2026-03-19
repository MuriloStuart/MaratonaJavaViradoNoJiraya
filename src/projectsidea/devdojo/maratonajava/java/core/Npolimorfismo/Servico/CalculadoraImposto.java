package projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Servico;

import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Produto;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Preço " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
