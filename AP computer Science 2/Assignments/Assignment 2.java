import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
 class Main{
public static void main (String str[]) throws IOException {
 
  
Scanner scan = new Scanner (System.in);

 System.out.println("Please Enter the Amount Paid:");
   double paid = scan.nextDouble();
 System.out.println(paid);

 System.out.println("Please Enter the Cost of the Item:");
   double cost = scan.nextDouble();
 System.out.println(cost);
 
   int p = (int) Math.round(100 * paid);
   int c = (int) Math.round(100 * cost);
   int change = (int) (p - c);
   double owed = (1.0* (p - c)/100);
 System.out.println("Change Owed: "+ owed);
 
   int quarters = (int)(change/ 25);
 System.out.println("Quarters: "+ quarters);
   double x = (change - (quarters * 25));

   int dimes = (int) ( x/ 10);
 System.out.println("Dimes: "+ dimes);
   double y = (x -(dimes * 10));
               
   int nickels = (int) (y/ 5);
 System.out.println("Nickels: "+ nickels);
   double z = (y - (nickels * 5));
               
   int pennies = (int) (z/ 1);
 System.out.println("Pennies: "+ pennies);
 
  }
}
