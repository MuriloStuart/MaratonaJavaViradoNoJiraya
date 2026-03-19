package projectsidea.devdojo.maratonajava.java.core.Hheranca.teste;

import projectsidea.devdojo.maratonajava.java.core.Hheranca.dominio.Endereco;
import projectsidea.devdojo.maratonajava.java.core.Hheranca.dominio.Funcionario;
import projectsidea.devdojo.maratonajava.java.core.Hheranca.dominio.Pessoa;

public class HerencaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua da tua");
        endereco.setCep("892256-25");
        Pessoa pessoa = new Pessoa("Souya");

        pessoa.setCpf("12119403902");
        pessoa.setEndereco(endereco);
        //pessoa.imprime();

        Funcionario funcionario = new Funcionario("murio");

        funcionario.setCpf("111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
        funcionario.relatorioPagamento();


    }
}
