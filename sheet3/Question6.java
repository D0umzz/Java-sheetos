package sheet3;

import java.util.Random;

public class Question6 {
    public static void main(String[] args) {

        StopWatch stopWatch=new StopWatch();

        int n = 100000;
        int[] numbers = new int[n];
        Random rand = new Random(12345);
        // Fill the array with rand values
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(1_000_000);
        }
        //Start the stop watch
        stopWatch.start();
        // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        //Snd the stop watch
        stopWatch.stop();

        //Print first 20 numbers to check
        for (int i = 0; i < 20; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        //Prints the time taken by the selection sort to finish
        System.out.println("the time taken by the selection sort on 100k nums  is: "+stopWatch.getElapsedTime()+" milis");
    }
}
class StopWatch{
    private long startTime;
    private long endTime;


    public StopWatch(){
        startTime=System.currentTimeMillis();
    }

    public void start(){
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }

    public double getStartTime() {
        return startTime;
    }
    public double getEndTime() {
        return endTime;
    }
}