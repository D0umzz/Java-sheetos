package sheet2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 9");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter 10 numbers:" );
        double[] arr=new double[10];
        for(int i=0;i<10;i++){
            arr[i]= input.nextDouble();
        }

        System.out.println("The minimum number is: "+min(arr));
        input.close();
    }
    public static double min(double[] array){
        double mi=array[0];
        for(int i=1;i<10;i++){
            if(array[i]<mi)mi=array[i];
        }
        return mi;
    }
}

