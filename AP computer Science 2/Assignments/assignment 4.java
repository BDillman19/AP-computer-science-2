import java.util.Scanner;
import java.lang.Math; 

class Main {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter a tweet:");
      String tweet = scan.nextLine();
      int ment = 0;
      int hash = 0;
      int y = tweet.length();
      int retweet = 0;
      if(y < 140)
      {
        for(int x = 0; x<y; x++){ 
          if(tweet.indexOf(x+2) <= tweet.length()-1){
            if((x <= y-2) &&(tweet.charAt(x)== '@') &&!((tweet.charAt(x+1) == ' ')||(tweet.charAt(x+1) == '\t')))
            {
              ment++;
            } 
            if((x <= y-2) &&(tweet.charAt(x)== '#') &&!((tweet.charAt(x+1) == ' ')||(tweet.charAt(x+1) == '\t')))
            {
              hash++;
            } 
            if((x <= y-3) &&(tweet.charAt(x)== 'R' || tweet.charAt(x)=='r') &&(tweet.charAt(x+1) == 'T' || tweet.charAt(x+1) == 't')&&(tweet.charAt(x+2)==':'))
            {
              retweet = 1;
            }
          }
        }
        System.out.println(tweet);
        System.out.println("Length Correct");
        System.out.println("Number of Mentions: " + ment);
        System.out.println("Number of Hashtags: " + hash);
        if(retweet == 1)
        {
          System.out.println("The input was a retweet.");
        }else{
          System.out.println("The input was not a retweet.");
        }
        
      }else{
        System.out.println("Excess Characters: " + (tweet.length() - 140));
      }
}
}