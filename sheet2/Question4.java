package sheet2;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 4");
        long num=234;
        System.out.println(sumDigits(num));
    }
    public static int sumDigits(long n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}