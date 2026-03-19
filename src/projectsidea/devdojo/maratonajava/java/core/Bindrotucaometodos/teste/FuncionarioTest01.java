package projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.teste;

import projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Jose";
        funcionario.idade = 45;
        funcionario.salario = new double[]{1000,1000,1000};
        funcionario.imprimeDados();
        funcionario.mediaSalarial();
    }
}