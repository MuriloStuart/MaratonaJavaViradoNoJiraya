package projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Teste;

import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Computador;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Produto;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Tomate;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen9", 3000);

        Tomate tomate = new Tomate("Tomate", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
