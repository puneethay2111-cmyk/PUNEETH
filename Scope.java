public class Scope
{
    public static void main(String[] args)
    {
        int num=10;
        num=3;
        dummyMethod(num);
    }
    static void dummyMethod(int passingValue)
    {
        System.out.println(passingValue);
    }
     
}
