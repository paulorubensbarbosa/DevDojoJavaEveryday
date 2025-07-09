package SFormatacao.test;

import java.text.DateFormat;
import java.util.*;

public class LocaleTest02 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        Calendar calendarioLocal = Calendar.getInstance();

        DateFormat calendarioBR = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());

        System.out.println(calendarioBR.format(calendarioLocal.getTime()));


        List<String> isoCountries = new ArrayList<>(Arrays.asList(Locale.getISOCountries()));

        String[] isoLanguages = Locale.getISOLanguages();

        isoCountries.forEach(System.out::print);

        System.out.println("Linguas");

        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage);
        }


        //System.out.println(isoCountries);

    }
}
