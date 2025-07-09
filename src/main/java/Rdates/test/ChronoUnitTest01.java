package Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1999, Month.OCTOBER, 25, 3, 30, 0);


        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));


        System.out.println( ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));

    }
}
