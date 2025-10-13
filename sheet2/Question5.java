package sheet2;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 5");
        int[] numbers={121,461};
        for(int num:numbers){
            if (isPalindrome(num)){
                System.out.printf("the number '%d' is Palindrome%n",num);
            }else System.out.printf("number is '%d' not Plaindrome%n",num);
        }
    }
    public static int reverse(int number){
        int n=0;
        while(number>0){
            n*=10;
            n+=number%10;
            number/=10;
        }
        return n;
    }
    public static boolean isPalindrome(int number){
        return number==reverse(number);

    }
}