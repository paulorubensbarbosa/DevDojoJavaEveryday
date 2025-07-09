package Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        LocalDate recorrencia25 = LocalDate.of(1999, 1, 1);

        recorrencia25 = recorrencia25.withMonth(2);
        System.out.println(recorrencia25);

        //Adiciona os dias e dependendo da quantidade, vira o mês
        //now = now.plusDays(2);


        //Para apenas Modificar o dia sem virar o Mês, usa-se o With
        now = now.withMonth(1);


        now = now.with(ChronoField.DAY_OF_MONTH, 20);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        System.out.println();
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());




    }
}
