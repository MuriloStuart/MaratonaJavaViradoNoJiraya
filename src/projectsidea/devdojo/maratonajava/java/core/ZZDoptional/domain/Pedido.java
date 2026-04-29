package projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain;

public class Pedido {
    private int id;
    private double preco;
    private String descricao;
    private Cliente cliente;

    public Pedido(int id, double preco, String descricao, Cliente cliente) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
