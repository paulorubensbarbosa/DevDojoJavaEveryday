package Rdates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        Period p1 = Period.of(10, 10, 25);
        System.out.println(p1);

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        Period p2 = Period.between(now, nowAfterTwoYears);
        System.out.println(p2);

        Period p3 = Period.ofWeeks(16);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println(p5);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        //Para pegar a quantidade de meses correspondente a uma quantidade de Semanas, vai precisar usar a Chrono Unit

        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));

        LocalDate agora = LocalDate.now();
        Period periodoSemanas = Period.ofWeeks(10);

        System.out.println(now.until(now.plusDays(periodoSemanas.getDays()), ChronoUnit.MONTHS));

    }
}