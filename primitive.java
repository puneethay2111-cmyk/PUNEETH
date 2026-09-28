public class primitive 
{
    public static void main (String[] args)
    {
        int passingNum=5;
        callingVariable(passingNum);
        System.out.println(" ");
        System.out.println("after method call");
        System.out.println(passingNum);
        int a[]={1,2,3,4,5,};
        callingArray(a);
        System.out.println(" ");
        System.out.println("after method call");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static void callingVariable(int num)
    {
        num++;
        System.out.print(num);
    }
    static void callingArray(int[] num)
    {
        num[2]=9;
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
    static void callingArray1(int[] num)
    {
        num[2]=9;
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}
