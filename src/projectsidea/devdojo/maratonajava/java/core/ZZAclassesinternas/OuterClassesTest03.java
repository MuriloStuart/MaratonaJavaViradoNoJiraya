package projectsidea.devdojo.maratonajava.java.core.ZZAclassesinternas;

public class OuterClassesTest03 {
    private String nome = "Lancha";

    static class  Nested{
        void print(){
            System.out.println(new OuterClassesTest03().nome);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
