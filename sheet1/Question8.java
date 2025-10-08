package sheet1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 8");
        int today;
        int dayN;
        int comingDay;
        String[] weekdays = { "Sunday","Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        Scanner input=new Scanner(System.in);
        System.out.print("Enter today’s day: ");
        today=input.nextInt();
        if ((today<0)||(today>6)){
            System.out.println("invalid input!!!!");
            return;
        }
        System.out.print("Enter the number of days elapsed since today: ");
        dayN=input.nextInt();
        input.close();
        comingDay=(today+dayN)%7;
        System.out.format("Today is %s and the future day is %s\n",weekdays[today],weekdays[comingDay]);
    }
}