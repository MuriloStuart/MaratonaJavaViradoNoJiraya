package projectsidea.devdojo.maratonajava.java.core.ZZAclassesinternas;

class Animal {
    public void walk() {
        System.out.println("Animal Walking");
    }
}

public class AnomynousClassesTest01 {

    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }

        };
        animal.walk();


    }
}
