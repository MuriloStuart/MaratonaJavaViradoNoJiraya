package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula06EstruturaDeRepetição03 {
    // Imprima os primeiros 25 digitos de um dado valor por exemplo, 50
    public static void main(String[] args) {
        int valorMax = 50;
        int limite = valorMax / 2;
        for(int i = 0 ; i <= valorMax; i++){
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
