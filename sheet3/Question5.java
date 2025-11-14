package sheet3;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int currentYear = calendar.get(GregorianCalendar.YEAR);
        int currentMonth = calendar.get(GregorianCalendar.MONTH) + 1;
        int currentDay = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current date: " + currentYear + "-" + currentMonth + "-" + currentDay);


        long elapsedTime = 1234567898765L;
        calendar.setTimeInMillis(elapsedTime);

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Date for elapsed time " + elapsedTime + ": " + year + "-" + month + "-" + day);
    }
}