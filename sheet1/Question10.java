package sheet1;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 10");
        double x1;
        double y1;
        double x2;
        double y2;
        double distance;
        double radius=6371.01;
        double inacos;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        x1=Math.toRadians(input.nextDouble());
        y1=Math.toRadians(input.nextDouble());
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        x2=Math.toRadians(input.nextDouble());
        y2=Math.toRadians(input.nextDouble());
        inacos=Math.sin(x1)*Math.sin(x2)+
                Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2);
        inacos = Math.min(1.0, Math.max(-1.0, inacos));
        distance=radius*Math.acos(inacos);
        System.out.println("The distance between the two points is "+distance);
        input.close();
    }
}