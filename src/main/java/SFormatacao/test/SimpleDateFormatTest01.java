package SFormatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String patern = "'Brasil' dd 'de' MMMM 'de' yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(patern);

        Date data = new Date();
        System.out.println(data);

        System.out.println(sdf.format(data));


    }
}
