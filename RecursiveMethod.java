public class RecursiveMethod 
{
   public static void main(String[] args) 
   {
      printNums(10);
   }   
   public static void printNums(int num)
   {
    if (num==0)
    {
        return;
    }
    printNums(num-1);   
    System.out.println(num);
  }
}
