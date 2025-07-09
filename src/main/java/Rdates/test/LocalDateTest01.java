package Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        //BET - America/Sao_Paulo

        LocalDate date = LocalDate.of(2025, Month.OCTOBER, 25);
        LocalDate agora = LocalDate.now();

        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());

        agora = agora.plusDays(2);

        System.out.println(agora);
        System.out.println(LocalDate.MAX);
    }
}
