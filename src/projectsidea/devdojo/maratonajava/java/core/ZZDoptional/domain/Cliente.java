package projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain;

public class Cliente {
    private String nome;
    private int anos;
    private Endereco endereco;

    public Cliente(String nome, int anos, Endereco endereco) {
        this.nome = nome;
        this.anos = anos;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
