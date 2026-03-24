package projectsidea.devdojo.maratonajava.java.core.Xserializacao.Dominio;

import java.io.Serializable;

public class Produto implements Serializable {
    private String nome;
    private int preco;
    private transient String codigoVerficado;

    public Produto(String nome, int preco, String codigoVerficado) {
        this.nome = nome;
        this.preco = preco;
        this.codigoVerficado = codigoVerficado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }


    public String getCodigoVerficado() {
        return codigoVerficado;
    }

    public void setCodigoVerficado(String codigoVerficado) {
        this.codigoVerficado = codigoVerficado;
    }
}
