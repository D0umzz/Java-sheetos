package sheet2;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 1");
        System.out.println("Miles      kilometers");
        for(int i=1;i<11;i++){
            System.out.printf("%-2d         %f%n",i,i*1.609);
        }
    }
}
