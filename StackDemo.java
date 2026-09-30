import java.util.LinkedList;

public class StsckDemo 
{
  public static void main(String[] args) 
  {
    LinkedList<String> bucket=new LinkedList<String>();
     bucket.push("toy1");
     bucket.push("toy2");
    bucket.push("toy3");
    bucket.push("toy4");
    bucket.push("toy5");

    while (!bucket.isEmpty()) 
    {
        System.out.println(bucket.pop());
    }
  }    
}
