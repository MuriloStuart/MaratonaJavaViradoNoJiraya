package projectsidea.devdojo.maratonajava.java.core.Sformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterTest02 {
    public static void main(String[] args) {
        //LocalDate agora = LocalDate.now();
        //System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(agora));
        // 1. Pegamos a data e hora atual
        LocalDateTime agora = LocalDateTime.now();

        // 2. Definimos a localidade para Português do Brasil
        Locale brasil = new Locale("pt", "BR");

        // 3. Criamos o formatador
        // 'EEEE' representa o dia da semana por extenso
        // 'MMMM' representa o mês por extenso
        // As palavras entre aspas simples 'de' são tratadas como texto fixo
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy", brasil);

        // 4. Formatamos e exibimos
        String dataFormatada = agora.format(formatador);

        System.out.println("Data formatada: " + dataFormatada);

    }
}
