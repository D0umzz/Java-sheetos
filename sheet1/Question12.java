package sheet1;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 12");
        int n;
        double length;
        double area;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        n=input.nextInt();
        System.out.print("Enter the side: ");
        length=input.nextDouble();
        area=(n*Math.pow(length,2))/(4*Math.tan(Math.PI/n));
        System.out.println(area);
        input.close();
    }
}