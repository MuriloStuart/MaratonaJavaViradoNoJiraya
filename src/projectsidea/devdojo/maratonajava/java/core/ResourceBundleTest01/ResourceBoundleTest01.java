package projectsidea.devdojo.maratonajava.java.core.ResourceBundleTest01;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBoundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt","BR"));
        System.out.println(bundle.getString("good.morning"));
    }
}
