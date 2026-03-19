package projectsidea.devdojo.maratonajava.java.core.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat02 {
    public static void main(String[] args){

        Locale localPT = new Locale("pt","PT");
        Locale localJP = Locale.JAPAN;
        Locale localIT = Locale.ITALIAN;
        NumberFormat [] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localPT);
        nfa[3] = NumberFormat.getCurrencyInstance(localIT);

        double valor = 1_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }




    }
}
