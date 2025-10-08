package sheet1;

import java.util.Random;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 7");
        Random random=new Random();
        int randMonth=random.nextInt(0,12);
        String[] months={"January","February","March","April","May",
                "June","July","August","September",
                "October","November","December"};
        System.out.println(months[randMonth]);
    }
}