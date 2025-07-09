package Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        Date date = c.getTime();
        System.out.println(date);

        c.add(Calendar.DAY_OF_MONTH, 2);

        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));



    }

    public static class DateTest01 {

        public static void main(String[] args) {
            Date date = new Date(1751028391464L);

            date.setTime(date.getTime() + 360000);
            System.out.println(date);
        }

    }
}
