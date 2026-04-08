package projectsidea.devdojo.maratonajava.java.core.ZZAclassesinternas;

public class OuterClassesTest01 {
    private String nome = "Murilo Stuart";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
