package Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 32, 12);
        System.out.println(localTime);
        LocalTime localTimeAgora = LocalTime.now();
        System.out.println(localTimeAgora);
        System.out.println(localTimeAgora.get(ChronoField.AMPM_OF_DAY));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
