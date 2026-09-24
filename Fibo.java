public class Fibo  
{
    public static void main(String[] args) 
   {
        int n = 10; 
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        for (int i = 0; i < n; i++) 
       {
            System.out.println( a); 
            
            int c = a + b; 
            a = b;         
            b = c;         
        }
    } 
}