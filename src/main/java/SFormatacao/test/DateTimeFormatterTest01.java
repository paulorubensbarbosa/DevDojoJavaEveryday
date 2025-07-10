package SFormatacao.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        //Sempre quer ver a palava Fomatter você está transformando o seu objeto em uma String e quando ver a palavra Parse está transformando a String em um Objeto

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250709", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDateTime parse2 = LocalDateTime.parse("2011-12-03T10:15:30", DateTimeFormatter.ISO_DATE_TIME);
        LocalDate parse3 = LocalDate.parse("2025-07-09", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println(s4 + "teste");

        System.out.println(LocalDateTime.parse("2025-07-09T00:00:00", DateTimeFormatter.ISO_DATE_TIME));


        //Para formatar Data e Hora exatamente no formato que quero usase o méodo ofPattern da classe DateTimeFormater:

        //Padrão BR:
        //dd/MM/yyyy
        //Padrão EUA:
        //MM/dd/yyyy
        //Padrão JP
        //yyyy/MM/dd

        DateTimeFormatter formatterPaternBR = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String agora = LocalDate.now().format(formatterPaternBR);
        System.out.println(agora);

        DateTimeFormatter formatterPaternBRComBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String agora2 = LocalDate.now().format(formatterPaternBRComBarra);
        System.out.println(agora2);

        LocalDate parseBR = LocalDate.parse("09/07/2025", formatterPaternBRComBarra);
        System.out.println(parseBR);

        Locale localeBR = new Locale("pt", "BR");
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", localeBR);
        String dataBR = LocalDate.now().format(formatterBR);
        System.out.println(dataBR);
        LocalDate parseDataBR = LocalDate.parse("09.julho.2025", formatterBR);
        System.out.println(parseDataBR);


//        Map<String, String> shortIds = ZoneId.SHORT_IDS;
//        System.out.println(shortIds);
//        LocalDate date1 = LocalDate.now(ZoneId.of("Asia/Tokyo"));
//        System.out.println(date1);
//
//        ZonedDateTime horaJapao = Instant.now().atZone(ZoneId.of("Asia/Tokyo"));
//        System.out.println(horaJapao);



    }
}
