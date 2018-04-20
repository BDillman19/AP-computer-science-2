/*
 * Lesson 3 - Unit 1 - User Input and Variables 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson03_template{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          
          String n;
          String snack;
          
          System.out.println("What is your name?");
          n = scan.nextLine ();
          System.out.println("Hello " + n + ". Nice to meet you");
      
          System.out.println("What is your favorite snack?");
          snack = scan.nextLine();
          System.out.println( snack + " sounds delicious");
          
          

     }

}


