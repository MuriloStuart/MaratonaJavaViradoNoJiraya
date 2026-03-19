package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria juvenil
        // idade >=15 && idade < 18 categoria juvenil
        // idade >=18 categoria adulto

        int idade = 30;

        if(idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }
    }
}
