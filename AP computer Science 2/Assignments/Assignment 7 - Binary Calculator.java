import java.util.Scanner;
import java.lang.Math;
class Main{
  public static int[] convertToBinary(int x)
  {
    int y = 0;
    int place = 0;
    int[] a = new int[8];
    
    for(int i = 0; i < 8; i++){
      place =((int)(Math.pow(2, 7-i)));
      y = x/place;
      a[i] = y;
      x =(x % place);
    }
    return a;
  }
  
  public static void printBin(int[] a)
  {
    
  for(int j = 0; j < 8; j++){
      System.out.print(a[j] + " ");    
    }
      System.out.println();
    }
      
  
  public static int[] addBin(int[] a, int[] b)
  {
    int[] c = new int[8];
    int carry = 0;
    int partial = 0;
    for(int i = 7;i > -1; i--)
  {
      partial = carry + a[i] + b[i];
    if(partial == 0)
    { c[i] = 0;
      carry = 0;
    }
    else if(partial == 1)
    { c[i] = 1;
      carry = 0;
    }
    else if(partial == 2)
    { c[i] = 0;
      carry = 1;
    }
    else if(partial == 3)
    { c[i] = 1; 
      carry = 1;
    }
  }
    if(carry == 1){
      System.out.println("Error: overflow");
      return c;
    }else{
      return c;
    }
  }
  
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x;
    int z;
    
   System.out.println("Enter a base ten number between 0 and 255, inclusive.");
   x = scan.nextInt();
   System.out.println("Enter a base ten number between 0 and 255, inclusive.");
   z = scan.nextInt();
   
   int[] a = convertToBinary(x);
    System.out.println("First binary number:");
    printBin(a);
  
   int[] b = convertToBinary(z);
    System.out.println("Second binary number:"); 
    printBin(b);
    
  
    System.out.println("Added:");
     int[] c = addBin(a, b);
    printBin(c);
}
}