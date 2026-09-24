public class twosum 
{
   public static void main( String[] args)
   {
    int a[]={1,3,5,9,4,6};
    int target=3;
    boolean is=false;
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+"\n");
        if(a[i]==target)
        {
            System.out.print("target is in a"+" "+"\n");
           is=true;
        }
     }
     if (is)
     {
        System.out.println("is in a");
     }
     else
     {
        System.out.print("is not in a");
     }
   }
}