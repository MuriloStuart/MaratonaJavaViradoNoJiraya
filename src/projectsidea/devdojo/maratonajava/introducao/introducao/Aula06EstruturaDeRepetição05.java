package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula06EstruturaDeRepetição05 {
    public static void main(String[] args) {
        // dado valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição Valorparcela >= 1000

        int valorCarro = 3000;

        for (int parcela = valorCarro; parcela >+ 1; parcela--) {
            double valorParcela = valorCarro/ parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("O carro pode ser parcelado em R$" + valorParcela + " em " +parcela + " parcelas");

        }



    }
}
