package projectsidea.devdojo.maratonajava.java.core.Pwrappers.test;

public class WrapperTest01   {
    public static void main(String[] args) {
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 12;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'E';
        Boolean booleanW = true;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("1");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
