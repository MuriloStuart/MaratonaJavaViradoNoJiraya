package projectsidea.devdojo.maratonajava.introducao.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= != Operadores logicos

        // && (and) || (or) !

        int idade = 35;
        float salario =  3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;


        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /=
        double bonus = 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %=2;
        System.out.println(bonus);




    }
}
