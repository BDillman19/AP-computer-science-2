/*
 * Lesson 10 Coding Activity Question 1
 * 
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 * 
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 * 
 * Sample run:
 * 
 *      Please enter two decimal values:
 *      2
 *      1.473
 *     
 *      The difference is: 0.527
 * 
 * Use this starter file as your template.
 * 
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_10_Activity {
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
     /*System.out.println("Please enter two decimal values: ");
     double ans = scan.nextDouble();
     double y = scan.nextDouble();
     double z = (((1000 * x)-(1000 * y))/1000);*/
     int s = Math.sqrt(26);
     System.out.println(s);

    }
}