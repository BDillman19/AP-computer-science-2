
import java.lang.String;

public class Lesson_15_FastStart
{
  
  public static void sortAndPrint(String [] list)
  {
    String swap = "";
    for(int i = 0; i < list.length - 1; i++)
    {
      for(int k = i + 1; k < list.length; k++)
      {
        if(list[k].compareTo(list[i]) < 0)
        {
          swap = list[i];
          list[i] = list[k];
          list[k] = swap;
        }
      }
    }
    for(int a = 0; a < list.length; a++)
    {
      System.out.print(list[a] + " ");
    }
    System.out.println();
  }
  public static void main (String[] args){
    
    String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
    sortAndPrint(list);
  }
}