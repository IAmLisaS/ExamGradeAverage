// Lisa Sinn
// Intro to Java - CSCI 1146 
// CSCI 1146-241
// Test Array 5
// TestArray5.java

import java.util.Scanner;

public class TestArray5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter student name: ");
       String name = sc.next();
       int scores[] = new int[5];
       System.out.println("Enter 5 test scores: ");
       for (int i = 0; i < 5; i++)
           scores[i] = sc.nextInt();
       double avg = getAverage(scores);
       System.out.println("Average : " + avg);
       System.out.println("Grade : " + getGrade(avg));
   }

   private static String getGrade(double avg) {
       if (avg >= 90)
           return "A";
       if (avg >= 80)
           return "B";
       if (avg >= 70)
           return "C";
       if (avg >= 60)
           return "D";
       return "F";

   }

   private static double getAverage(int[] arr) {
       double avg = 0;
       for (int i = 0; i < arr.length; i++)
           avg = avg + arr[i];

       return avg / arr.length;
   }
}