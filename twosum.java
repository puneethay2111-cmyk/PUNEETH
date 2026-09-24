public class twosum 
{
   public static void main( String[] args)
   {
    int a[]={1,3,5,9,4,6};
    int target=3;
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+"\n");
        if(a[i]==target)
        {
            System.out.print("target is in a"+" "+"\n");
        }
     }
   }
}