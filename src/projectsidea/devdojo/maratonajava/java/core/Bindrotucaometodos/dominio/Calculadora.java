package projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(15 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeDivisaDeDoisNumeros (double num1, double num2) {
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);

    }

    public void alteraDoisNumeros(int numero1, int numero2){
        int a = 99;
        int b = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }

    public void somaArray(int [] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}

