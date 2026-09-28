public class primitive 
{
    public static void main (String[] args)
    {
        int passingNum=5;
        callingVariable(passingNum);
        System.out.println(" ");
        System.out.println("after method call");
        System.out.println(passingNum);
    }
    static void callingVariable(int num)
    {
        num++;
        System.out.print(num);
    }
}
