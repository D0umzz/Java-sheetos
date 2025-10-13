package sheet2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 6");
        int num1;
        int num2;
        int num3;
        Scanner input=new Scanner(System.in);
        System.out.print("enter number1: ");
        num1=input.nextInt();
        System.out.print("enter number2: ");
        num2=input.nextInt();
        System.out.print("enter number3: ");
        num3=input.nextInt();
        input.close();
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers(
            double num1, double num2, double num3){
        double[] numbers={num1,num2,num3};
        double temp;
        for(int i=0;i< numbers.length-1;i++){
            for(int j=0;j< numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]) {
                    temp =numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}