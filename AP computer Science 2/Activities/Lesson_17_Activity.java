class Lesson_17_Activity
{
  public static boolean isSorted(int[] a)
  {
    int flag = 0;
    int c = 1;
    for(int i = 0; i < a.length; i++ )
    {
      if(a[i] < a[c])
      {
        flag = 1;
        break;
      }
      c++;
    }
    
    if(flag == 1)
    {
      return false;
    }else{
      return true;
    }
  }
  
  public static int binarySearch(int[] a, int b)
  {
    int loc = 0;
   return loc; 
  }
}