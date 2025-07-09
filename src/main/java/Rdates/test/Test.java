package Rdates.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {

        Period semanas = Period.ofWeeks(15);

        LocalDate agora = LocalDate.now();
        LocalDate agoraPlus7 = LocalDate.now().plus(semanas);

        Long meses = ChronoUnit.MONTHS.between(agora, agoraPlus7);

        System.out.println(meses);


    }
}
