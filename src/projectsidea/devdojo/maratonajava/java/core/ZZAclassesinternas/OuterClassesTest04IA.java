package projectsidea.devdojo.maratonajava.java.core.ZZAclassesinternas;


//Desafio: Crie uma interface Operacao com um método executar(int a, int b). Implemente ela de duas formas diferentes: uma usando classe anônima e outra usando lambda. As duas devem somar os valores! 🤔


public class OuterClassesTest04IA {
    interface Operacao {
        void executar(int a, int b);
    }

    public static void main(String[] args) {
        Operacao operacao = new Operacao() {
            @Override
            public void executar(int a, int b) {
                int resultado = a + b;
                System.out.println(resultado);
            }
        };
        operacao.executar(10, 5);

        Operacao operacaoLamnda = ((a, b) -> System.out.println(a + b));
        operacaoLamnda.executar(1, 2);

    }
}
