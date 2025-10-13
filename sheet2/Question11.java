package sheet2;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Sheet 2 - Question 11");
        //student's array
        int[] students=new int[8];
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
         for (int i = 0; i < answers.length; i++) {
             // Grade one student
             int correctCount = 0;
             for (int j = 0; j < answers[i].length; j++) {
                 if (answers[i][j] == keys[j])
                     correctCount++;
                 }
             students[i]=correctCount;
         }
         sortD(students);
        for(int i=0;i< students.length-1;i++){
            System.out.println("Student " + (i+1) + "'s correct count is " +
                    students[i]);
            }
    }
    static public void sortD(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int temp;
            for(int j=1;j< arr.length-i-1;j++){
                if(arr[j]<arr[j+1]) {
                    temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}