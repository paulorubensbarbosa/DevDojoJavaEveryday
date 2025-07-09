package SFormatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //pt=BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");


        Locale localeUs = new Locale("en", "US");


        Calendar calendar = Calendar.getInstance();
        DateFormat d1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat d2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);


        DateFormat d4 = DateFormat.getDateInstance(DateFormat.FULL, localeUs);
        DateFormat d3 = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));


        System.out.println("Us: " + d4.format(calendar.getTime()));
        System.out.println("Brasil: " + d3.format(calendar.getTime()));
        System.out.println("Itália " + d1.format(calendar.getTime()));
        System.out.println(d2.format(calendar.getTime()));

        System.out.println(localeCH.getCountry());



    }
}
