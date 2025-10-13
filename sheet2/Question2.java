package sheet2;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 2");
        double tuition=10000;
        double sum=0;
        System.out.println("after year/s      Tuition");
        for(int i=1;i<11;i++){
            tuition=tuition*1.05;
            System.out.printf("%-2d                %.2f%n", i, tuition);
            sum+=tuition;
        }
        System.out.printf("the total tuition after 10 years :%.2f %n",sum);
    }
}
