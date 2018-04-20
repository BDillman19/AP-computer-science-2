/*
 * Lesson 11 - Unit 2 - Simple Ifs 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson11_template{

     public static void main (String str[]) throws IOException {

       Scanner scan = new Scanner(System.in);
       
       Double numberWheels = 0.0;
       
       System.out.println("put in a number");
       
       numberWheels = scan.nextDouble();
       
       if(numberWheels==17.25)
         System.out.println("equal");
        
     }

}