package SFormatacao.test;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localeBR = new Locale("pt", "BR");
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeBR);

        NumberFormat[] nfc = new NumberFormat[4];
        nfc [0] = NumberFormat.getCurrencyInstance(localeBR);
        nfc [1] = NumberFormat.getCurrencyInstance(localeUS);
        nfc [2] = NumberFormat.getCurrencyInstance(localeJP);
        nfc [3] = NumberFormat.getCurrencyInstance(localeIT);

//        List<NumberFormat> listNumberFormat = new ArrayList<>(Arrays.asList(nfc));
//
        double valor = 10_000;
//
//        listNumberFormat.forEach(f -> System.out.println(f.format(valor)));


        for (NumberFormat format : nfc) {
            System.out.println(format.format(valor));
            //numberFormat.setMaximumFractionDigits(1);
            System.out.println(format.getMaximumFractionDigits());
        }



//        System.out.println(numberFormat.format(valor));



    }
}
