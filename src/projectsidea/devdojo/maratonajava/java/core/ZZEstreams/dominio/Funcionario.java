package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private int idade;

    public Funcionario(String nome, String departamento, double salario, int idade) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.idade = idade;


    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    // Construtor, getters e setters

}
