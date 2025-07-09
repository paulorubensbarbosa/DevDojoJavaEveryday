package Rdates.test;

import java.time.*;

public class DurationTest01 {
    public static void main(String[] args) {

        //Dutarion, retorna as horas, minutos e segundos entre dois horários, podem ser usados as classes LocalTime e Instant. Mas a LocalDate não, pois ela não retorna o tempo, só a Data

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime ltNow = LocalTime.now();
        LocalTime ltNowMinus7 = LocalTime.now().minusHours(7);

        Duration durationTime = Duration.between(ltNow, ltNowMinus7);
        Duration duration = Duration.between(now, nowAfterTwoYears);
        Duration d3 = Duration.between(Instant.now(), Instant.now().minusSeconds(7));


        System.out.println(Duration.ofDays(100000));

        System.out.println(d3);

        System.out.println(durationTime);

        System.out.println(duration);
    }
}
