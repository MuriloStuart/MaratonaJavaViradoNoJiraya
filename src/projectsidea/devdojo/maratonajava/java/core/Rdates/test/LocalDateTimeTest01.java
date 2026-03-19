package projectsidea.devdojo.maratonajava.java.core.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getMonth());
        LocalDate date = LocalDate.of(2026,05,7);
        LocalTime time = LocalTime.of(12,50,34);

    }
}
