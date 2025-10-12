package sheet1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 4"); 
        double radius;
        double length;
        double area;
        double volume;
        System.out.print("Enter the radius and length of a cylinder: ");
        Scanner input=new Scanner(System.in);
        radius=input.nextDouble();
        length=input.nextDouble();
        input.close();
        area = radius * radius * Math.PI;
        volume= area*length;
        System.out.format("The area is: %.3f\n",area);
        System.out.format("The volume is: %.3f\n",volume);

    }
}