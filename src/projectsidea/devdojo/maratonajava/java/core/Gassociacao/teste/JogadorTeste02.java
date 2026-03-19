package projectsidea.devdojo.maratonajava.java.core.Gassociacao.teste;

import projectsidea.devdojo.maratonajava.java.core.Gassociacao.dominio.Equipe;
import projectsidea.devdojo.maratonajava.java.core.Gassociacao.dominio.Jogador;



public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        jogador1.imprime();
        Equipe equipe = new Equipe ("Selecao Brasileira");

        jogador1.setEquipe(equipe);
        jogador1.imprime();
    }
}
