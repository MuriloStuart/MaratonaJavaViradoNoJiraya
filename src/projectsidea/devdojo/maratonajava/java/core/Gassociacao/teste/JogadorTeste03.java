package projectsidea.devdojo.maratonajava.java.core.Gassociacao.teste;

import projectsidea.devdojo.maratonajava.java.core.Gassociacao.dominio.Equipe;
import projectsidea.devdojo.maratonajava.java.core.Gassociacao.dominio.Jogador;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Equipe equipe = new Equipe("Brasil");
        Jogador[] jogadores = {jogador,jogador2};
        jogador.setEquipe(equipe);
        jogador2.setEquipe(equipe);

        equipe.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        equipe.imprime();
    }
}
