package sheet1;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 3");
        double secondsInYear=365*24*60*60;
        double population=312032486;
        double bpy=secondsInYear/7;
        double dby=secondsInYear/13;
        double iby=secondsInYear/45;
        System.out.println("--------------------------------------------");
        for(int i=1;i<=5;i++){
            population=population+bpy+iby-dby;
            System.out.printf("The population after %d year(s) is %.0f\n", i, population);
            System.out.println("--------------------------------------------");
        }
    }
}
