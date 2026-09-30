public class TrycatchDemo
{
    public static void main(String[] args)
    {
        int solution;
        try
        {
            solution = 4/0;
            System.out.println("Solution: " + solution);
        }
        catch (Exception e)
        {
            System.out.println("A number can not be divided by zero.");
        }
        finally
        {
            System.out.println("Finally block is always executed.");
        }
    }
}