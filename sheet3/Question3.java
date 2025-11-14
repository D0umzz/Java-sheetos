package sheet3;

import java.util.Date;

public class Question3 {
    public static void main(String[] args) {
        Date date = new Date();

        long[] times = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L
        };

        for (long elapsedTime : times) {
            date.setTime(elapsedTime);
            System.out.println("Elapsed time: " + elapsedTime + " ms -> " + date.toString());
        }
    }
}