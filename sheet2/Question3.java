package sheet2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 3");
        Scanner input=new Scanner(System.in);
        int sNum;
        System.out.print("How many students do u want to insert there data at least 2: ");
        sNum= input.nextInt();
        String[] names=new String[sNum];
        double[] degrees=new double[sNum];
        for (int i=0;i<sNum;i++){
            System.out.printf("Enter the name and degree of stu N%d: ",i+1);
            names[i]=input.next();
            degrees[i]=input.nextInt();

        }
        input.close();
        int first=maxidx(degrees);
        int second=scndmaxidx(degrees,first);
        System.out.printf("the stu with the highest score is: %s%n",names[first]);
        System.out.printf("the stu with the second highest score is: %s%n",names[second]);
    }
    static int maxidx(double[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) max = i;
        }
        return max;
    }
    static int scndmaxidx(double[] arr,int frst) {
        int scnd = -1;
        for (int i = 1; i < arr.length; i++) {
            if (i==frst)continue;
            if (scnd==-1||arr[i] > arr[scnd]) scnd = i;
        }
        return scnd;
    }
}
