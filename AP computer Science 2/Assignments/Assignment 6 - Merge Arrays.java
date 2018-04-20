import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String[] args)
{
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit");
    int[] firstArray = new int[10000];
    int[] secondArray = new int[10000];

    int i = 0;
    int x = 1;
    int error = 0;
    while (x > 0) {
      x = scan.nextInt();
      if (x > 0) {
        firstArray[i] = x;
        if (i > 0&& firstArray[i] < firstArray[i-1]){
          error++;
        }
        i++;
      }
    }
    System.out.println("\nEnter the values for the second array, up to 10000 values, enter zero or a negative number to quit");
    int a = 1;
    int b = 0;
    while (a > 0) {
      a = scan.nextInt();
      if (a > 0){
        secondArray[b] = a;
        if (b > 0 && secondArray[b] < secondArray[b-1]){
          error++;
        }
        b++;
      }
    }

    int[] endArray = new int[i+b];
    if (error > 0){
      System.out.println("\n\nFirst Array:"); 
      for (int f = 0; f < i;f++){
        System.out.print(firstArray[f] + " ");
      }
      System.out.println("\n");
      System.out.println("Second Array:"); 
      for (int g = 0; g < b;g++){
        System.out.print(secondArray[g] + " ");
        
      }
      System.out.println("ERROR: Array not in correct order");
    }
    else {
      int c = 0;
      int d = 0;
      int e = 0;
      while (c < i && d < b)
      {
        if (firstArray[c] < secondArray[d])
        {
          endArray[e] = (firstArray[c]);

          c++;
        }
        else
        {
          endArray[e] = secondArray[d];
          
          d++;
        }
        e++; 
      }
      while (c < i)
      {
        endArray[e] = firstArray[c];
        c++;
        e++;
      }
      while (d < b)
      {
        endArray[e] = secondArray[d];
        d++;
        e++;
      }
      System.out.println("\n\nFirst Array:"); 
      for (int f = 0; f < i;f++){
        System.out.print(firstArray[f] + " ");
      }
      System.out.println("\n");
      System.out.println("Second Array:"); 
      for (int g = 0; g < b;g++){
        System.out.print(secondArray[g] + " ");
        
      }
      System.out.println("\n");
      System.out.println("Merged Array:");
      for (int h = 0; h < i + b; h++){
        System.out.print(endArray[h] + " ");
      }
    }
  } 
}
