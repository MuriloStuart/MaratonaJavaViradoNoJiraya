package projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.teste;

import projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(-5);

       // pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
