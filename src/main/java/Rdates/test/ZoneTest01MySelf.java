package Rdates.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ZoneTest01MySelf {
    public static void main(String[] args) {

        //Relembrando o Uso do Chrono Unit para saber quantos meses equivalem a 20 semanas
        LocalDate now = LocalDate.now();
        LocalDate nowPlus2Weeks = LocalDate.now().plusWeeks(20);

        System.out.println(ChronoUnit.MONTHS.between(now, nowPlus2Weeks));

        //Hora agora no Japão
        System.out.println(ZoneId.SHORT_IDS);

        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime horaEmTokyo = Instant.now().atZone(tokyoZoneId);
        System.out.println(horaEmTokyo);


    }
}
