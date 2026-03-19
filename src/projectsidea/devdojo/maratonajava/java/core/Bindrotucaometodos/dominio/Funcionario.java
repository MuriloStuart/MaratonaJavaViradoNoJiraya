package projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salarios : salario ){
            System.out.print(salarios + ", ");
        }
    }

    public void mediaSalarial(){
        if (salario == null){
            return;
        }
        double mediaSalarial = 0;
        for (double media : salario){
            mediaSalarial += media;
        }
        mediaSalarial = mediaSalarial/salario.length;
        System.out.println("A media salarial do funcionario " + this.nome + " é " + mediaSalarial);
    }

}