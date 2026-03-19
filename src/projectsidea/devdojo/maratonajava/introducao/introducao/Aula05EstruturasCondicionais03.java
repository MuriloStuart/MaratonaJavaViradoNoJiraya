package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

       double salarioAnual = 10000;double imposto;

       if( salarioAnual <= 34712){
           imposto = salarioAnual * (9.7/100);
      }else if(salarioAnual > 34712 && salarioAnual <= 68507){
          imposto = salarioAnual * (37.5/100);
       }else{
           imposto = salarioAnual * (49.5/100);
       }
       System.out.println("Seu imposto anual será de "+imposto);

//        int idade = 88;
//
//        if (idade <= 13){
//            System.out.println("Criança");
//        } else if ( idade >=14 && idade <18 ) {
//            System.out.println("Adolescente");
//        } else if (idade >= 18 && idade <=64) {
//            System.out.println("Adulto");
//        } else{
//            System.out.println("Idoso");
//        }

//        int numeroParOuImpar = 9;
//        String par = "é para";
//        String impar = "é impar";
//
//        String resultado = (numeroParOuImpar % 2 == 0) ? par : impar;
//
//        System.out.println(resultado);

    }
}