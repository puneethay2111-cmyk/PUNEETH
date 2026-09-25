public class RecursionDemo 
{
    public static void main(String[] args) 
    {
      printNums1();
    }
    static void printNums1()
    {
        System.out.println(3);
        printNums2();
    }
    static void printNums2()
    {
        System.out.println(2);
        printNums3();
    }
    static void printNums3()
    {
        System.out.println(1);
    }
}
