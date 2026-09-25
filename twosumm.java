public class twosumm 
{
    public static void main( String[] args)
   {
    int a[]={1,3,5,9,4,6};
    int target=7;
    for(int i=0;i<a.length;i++)
    {
        for ( int j=i+1;j<a.length;j++)
        {
            if (a[i]+a[j]==target)
            {
                System.out.print("index:"+i+" "+j+"\n");
            }
        }
    }
  }
}