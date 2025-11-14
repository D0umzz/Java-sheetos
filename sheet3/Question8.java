package sheet3;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the a,b,c:");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        input.close();
        QuadraticEquation quadEq=new QuadraticEquation(a,b,c);
        if (quadEq.getDiscriminant()>0){
            System.out.println("root1 = "+quadEq.getRoot1());
            System.out.println("root2 = "+quadEq.getRoot2());
        }
        else if(quadEq.getDiscriminant()==0){
            System.out.println("root1 = "+quadEq.getRoot1());
        }
        else System.out.println("the equation has no roots");
    }
}
class QuadraticEquation{
    private int a;
    private int b;
    private int c;
    public QuadraticEquation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getDiscriminant(){
        return Math.pow(b,2)-(4*a*c);
    }

    public double getRoot1(){
        if (getDiscriminant()<0) return 0;
        else return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }

    public double getRoot2(){
        if (getDiscriminant()<0) return 0;
        else return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}