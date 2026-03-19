package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        int [] [] dias =  new int[3][3];
        dias[0] [0] = 31;
        dias[0] [1] = 28;
        dias[0] [2] = 55;
        dias[1] [0] = 25;
        dias[1] [1] = 45;
        dias[1] [2] = 33;
        dias[2] [0] = 15;
        dias[2] [1] = 15;
        dias[2] [2] = 15;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }

        }

        System.out.println("------------------");

        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }

    }
}
