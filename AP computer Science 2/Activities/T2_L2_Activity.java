import java.util.ArrayList;
import java.util.Scanner;

class Main {
  
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);
      String flag = null;
      String stop = "STOP";
      ArrayList <String> words = new ArrayList <String>();
      System.out.println("Please enter words, enter STOP to stop the loop.");
      while(flag != stop)
      {
        flag = scan.nextLine();
        if(flag.equals(stop))
        {
          break;
        }
        words.add(flag);
      }
      int count = words.size()-1;
     // System.out.println(words);
      //System.out.println(count);
      for (int i = count; i > -1; i--)
      {
       if(words.get(i).indexOf('a')  < 0)
         words.remove(i);
      }
      for(String b: words)
        System.out.println(b);
    }
}