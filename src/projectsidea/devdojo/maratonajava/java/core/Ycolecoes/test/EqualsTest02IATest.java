package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Livro;

import java.util.ArrayList;
import java.util.List;

public class EqualsTest02IATest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Morro ouviantes", "Machado De Assis", "1B45CV");
        Livro livro2 = new Livro("Guerra dos Tronos", "GRRM", "1B45CV");
        //System.out.println(livro1.equals(livro2));

        List <String> tarefas = new ArrayList<>();
        tarefas.add("Limpar o quarto");
        tarefas.add("Tomar café");
        tarefas.add("Se divertir");
        for(String tarefa : tarefas){
            System.out.println(tarefa);
        }
        System.out.println("-----------");
        tarefas.add(0,"Tarefa urgente");

        tarefas.remove(tarefas.size()-1);
        for(String tarefa : tarefas){
            System.out.println(tarefa);
        }
    }
}
