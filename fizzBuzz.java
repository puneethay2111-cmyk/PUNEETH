public class fizzBuzz  
{
    public static void main(String[] args) 
   {
        int i,n=20;
        String a="FizzBuzz";
        String b="BuzzFizz";
        String c="fizzfizz";
        for(i=1;i<=n;i++)
        {
            if(i%3==0)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(a);
            }
        
            if(i%4==0)
           {
              System.out.println(c);
         }
         }
    }
    
}
