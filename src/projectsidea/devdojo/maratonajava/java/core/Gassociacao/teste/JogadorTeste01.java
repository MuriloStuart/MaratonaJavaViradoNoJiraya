package projectsidea.devdojo.maratonajava.java.core.Gassociacao.teste;

import projectsidea.devdojo.maratonajava.java.core.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
