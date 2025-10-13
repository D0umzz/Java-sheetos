package sheet2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 10");
        Scanner input=new Scanner(System.in);
        double[][]matrix=new double[4][4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.printf("Enter a 4−by−4 matrix row by row: ");
                matrix[i][j]=input.nextDouble();
            }
            System.out.printf("%n");
        }
        input.close();
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.printf("%.1f ",matrix[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.println(sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] m){
        double d1=0;
        double d2=0;
        for (int i=0,j=3;i<4;i++,j--){
            d1+=m[i][i];
            d2+=m[i][j];
        }
        d1=d1>d2?d1:d2;
        return d1;
    }
}