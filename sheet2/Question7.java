package sheet2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 7");
        Scanner input=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i< arr.length;i++){
            System.out.printf("N%d:",i+1);
            arr[i]=input.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.printf("%d%n",arr[i]);
        }
        input.close();
    }
}