package sheet3;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        double a,b,c,d,e,f;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter (a,b,c,d,e,f):");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        d=input.nextDouble();
        e=input.nextDouble();
        f=input.nextDouble();
        input.close();
        LinearEquation linearEq=new LinearEquation(a,b,c,d,e,f);
        if (linearEq.isSolvable()) {
            System.out.println("x = " + linearEq.getX());
            System.out.println("y = " + linearEq.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}
class LinearEquation{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    public LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    public boolean isSolvable(){
        return (a*d - b*c)!=0;
    }

    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
}