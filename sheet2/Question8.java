package sheet2;

import java.util.Random;

public class Question8 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 8");
        int[] counts= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int idx;
        Random random=new Random();
        for(int i=0;i<100;i++){
            idx= random.nextInt(0,10);
            counts[idx]++;
        }
        for(int i=0;i<10;i++){
            System.out.printf("%d`s:%d%n",i+1,counts[i]);
        }
    }
}