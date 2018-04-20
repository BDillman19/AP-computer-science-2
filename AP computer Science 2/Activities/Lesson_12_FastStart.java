import java.util.ArrayList;
import java.lang.Math;
public class Lesson_12_FastStart
{
  public static void main (String[] args){
    int x;
    int y;
    ArrayList<String> words = new ArrayList<String>();
 
    words.add("who");
    words.add("what");
    words.add("where");
    words.add("when");
    words.add("how");
    words.add("this");
    words.add("there");
    words.add("that");
    words.add("them");
    words.add("yes");
 
    String a = "";
    String b = "";
 
    x = (int)((Math.random()*9)+ 1);
    y = (int)(Math.random()*10);
 
    
    if (x == y)
    {
      y = (int)(Math.random()*x);
    }
    System.out.println(x + "\n" + y);
    a = words.get(x);
    b = words.get(y);
 System.out.println(a + " " + b);
  }
}