package projectsidea.devdojo.maratonajava.java.core.Sformatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf =  new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
