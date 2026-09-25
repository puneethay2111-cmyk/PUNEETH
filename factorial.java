public class factorial
{
    public static void main(String[] args) 
    {
        int num=5;
        int fa=1;
        for(int i=1;i<=num;i++)
        {
            fa=fa*i;
        }
        System.out.println("Factorial of "+num+" is "+fa);
    }
    
}
