public class Scope 
{
    public static void main(String[] args) 
    {
        int num = 10;
        num = 3;
        dummyMethod(num);
    }

    // Moved outside of main() but still inside the class
    static void dummyMethod(int passingValue)
    {
        System.out.println(passingValue);
    }
}