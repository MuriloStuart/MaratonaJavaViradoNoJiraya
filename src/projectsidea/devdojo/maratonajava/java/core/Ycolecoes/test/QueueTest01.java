package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("J");
        fila.add("C");
        fila.add("A");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }

    }
}
