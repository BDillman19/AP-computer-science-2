import java.util.ArrayList;
import java.util.Scanner;

class Main {
  
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);
      
      String flag = null;
      String stop = "STOP";
      ArrayList <String> a = new ArrayList <String>();
      
      while(flag != stop)
      {
        flag = scan.nextLine();
        if(flag.equals(stop))
        {
          break;
        }
        a.add(flag);
      }
      int count = a.size();
      System.out.println(count);
      System.out.println(a);
     
    if(count > 2)
    {
      a.remove(count - 1);
      a.remove(0);
      System.out.println(a);
    }    
  }    
}