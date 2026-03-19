package projectsidea.devdojo.maratonajava.java.core.Npolimorfismo.Dominio;

public abstract class Produto implements Taxevel{
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
