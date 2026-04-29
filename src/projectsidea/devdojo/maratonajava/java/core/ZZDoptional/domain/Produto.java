package projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain;

import java.util.UUID;

public class Produto {
    private String id;
    private String nome;

    public Produto(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
