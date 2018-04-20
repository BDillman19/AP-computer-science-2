import java.util.Scanner;
import java.lang.Math; 
import java.lang.String;
class Main {
  public static void main(String[] args){
     
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the first String: ");
      String firstString = scan.nextLine();
      System.out.println("Enter the replacement String: ");
      String secondString = scan.nextLine();
      int place = -1;
      int x = 0;
      for(int a= 0; a <= firstString.length()-1; a++)
      {
        if(!(Character.isLetter(firstString.charAt(a))||(Character.isWhitespace(firstString.charAt(a)))||(firstString.charAt(a)=='%')))
        {
          System.out.println("Error: Incorrect characters");
          x = 1;
          break;
        }
      }
          
      
      if(x == 0){ 
      for(int i= 0; i <= firstString.length()-1; i++)
      {
        if(firstString.charAt(i) =='%')
        {
          place = i;  
        } 
      }
      if(place == -1)
      {
        System.out.println("Error: no %");    
      }else{
        
      String stringA = firstString.substring(0, place);
      String stringB = firstString.substring(place+1);
      
      System.out.println(stringA + secondString + stringB);
 
      }
      } 
}
}