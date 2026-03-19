package projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Teste;

import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Computador;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Produto;
import projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen9",3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------------------");

        Produto produto2 = new Tomate("Tomate",20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("---------------------------");
    }
}
