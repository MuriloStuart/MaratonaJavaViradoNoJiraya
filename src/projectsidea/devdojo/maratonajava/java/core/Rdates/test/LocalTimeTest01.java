package projectsidea.devdojo.maratonajava.java.core.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,12);
        LocalTime timeNOW = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNOW);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

    }
}
