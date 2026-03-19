package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
//        int [] array = {1,55,66,55};
//
//        int [] [] arrayInt = new int[3][];
//
//        arrayInt [0] = new int[2];
//        arrayInt [1] = array;
//        arrayInt [2] = new int[] {1,2,3,34,5};
//
//        int [] [] arrayInt2 = {{1,2}, {1,3,5,7}, {55,28,39,45,85}};
//
//        for(int [] arrayBase : arrayInt2){
//            System.out.println("\n------");
//            for( int num: arrayBase){
//                System.out.print(num + " ");
//
//            }
//        }

//

       String [] frutas = new String[5];
       frutas [0] = "Maça";
       frutas [1] = "Uva";
       frutas [2] = "Banana";
       frutas [3] = "Caqui";
       frutas [4] = "Melão";

        for (int i = frutas.length - 1; i > 0 ; i--) {
            System.out.println(frutas[i]);
        }
    }
}
