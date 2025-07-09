package Rdates.test;

import java.time.*;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        LocalDate ld = LocalDate.of(2025, Month.OCTOBER, 25);
        LocalDate ldParse = LocalDate.parse("2026-10-25");

        LocalTime lt = LocalTime.of(9, 45, 21);
        LocalTime ltParse = LocalTime.parse("09:45:21");

        LocalDateTime ldtAniversario = LocalDateTime.of(2025, Month.OCTOBER, 25,6, 6);

        LocalDateTime ldtJuntos = LocalDateTime.of(ld, lt);

        System.out.println(ldtAniversario);
        System.out.println(ldt);
        System.out.println(ltParse);
        System.out.println(ldtJuntos);
    }
}
