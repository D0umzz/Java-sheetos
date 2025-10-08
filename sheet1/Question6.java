package sheet1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 6");
        int num;
        int total=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        num=input.nextInt();
        input.close();
        if((num>1000)||(num<0)){
            System.out.println("number not valid!!!");
            return;
        }
        while(num>0){
            total+=num%10;
            num/=10;
        }
        System.out.println(total);

    }
}