package projectsidea.devdojo.maratonajava.java.core.ZZAclassesinternas;

public class OuterClassesTest02 {
    private String nome = "Murilo";

    void print(){
        String LastName = "Stuart";
        class LocalClass{
            public void printLocal(){
                System.out.println(nome + " " + LastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();

        new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 obj = new OuterClassesTest02();
        obj.print();

    }
}
