package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula06EstruturaDeRepetição02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 100000

        int cont = 0;

      /*  while (cont <+ 100000) {
            System.out.println(cont);
            cont= cont + 2;
        } */

        for(int i = 1 ; i <= 100000; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }
}
