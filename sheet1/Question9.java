package sheet1;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 9");
        String ISBN;
        int d10;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        ISBN = input.nextLine();
        input.close();
        if (ISBN.length()!=9){
            System.out.println("invalid input: you must input 9digits");
            return;
        }
        for (int i = 0; i < ISBN.length(); i++) {
            if (!Character.isDigit(ISBN.charAt(i))) {
                System.out.println("Invalid input: Only digits are allowed");
                return;
            }
        }
        int[] ds=new int[ISBN.length()];
        for(int i=0;i<ISBN.length();i++){
            ds[i]= Character.getNumericValue(ISBN.charAt(i));
        }
        d10=(ds[0]*1 + ds[1]*2 + ds[2]*3 + ds[3]*4+ ds[4]*5 +
                ds[5]*6+ ds[6]*7 + ds[7]*8 + ds[8]*9)%11;
        if (d10==10){
            System.out.println(ISBN+"X");
            return;
        }
        System.out.println(ISBN+d10);
    }
}

