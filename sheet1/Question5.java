package sheet1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 5");
        double subtotal;
        double gratuityRate;
        double gratuity;
        double total;
        System.out.println("Sheet 1 - Question 4");
        System.out.print("Enter the subtotal and a gratuity rate: ");
        Scanner input=new Scanner(System.in);
        subtotal=input.nextDouble();
        input.close();
        gratuityRate=input.nextDouble()/100;
        gratuity = subtotal * gratuityRate;
        total= subtotal+gratuity;
        System.out.format("The gratuity is %.2f and total is %.2f\n",gratuity,total);


    }
}