package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula06EstruturaDeRepetição04 {
    public static void main(String[] args) {
        // dado valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição Valorparcela >= 1000

        int valorCarro = 25800;
        int valorParcela = 0;
        int qntdVzs = 0;

        for (int i = 1; i < valorCarro; i++) {

            valorParcela = valorCarro /i;
            qntdVzs = i;
            if(valorParcela >= 1000){
                System.out.println("O carro pode ser parcelado em " + qntdVzs +" de " + valorParcela);
            } else{
                break;
            }
        }



    }
}
