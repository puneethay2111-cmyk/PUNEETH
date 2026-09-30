import java.util.HashMap;
public class HashMapDemo 
{
   public static void main(String[] args)
   {
    HashMap<String,Integer> A=new HashMap<String,Integer>();
    A.put("Maths", 90);
    A.put("Science", 80);
    A.put("English", 50);
    A.put("Sanskrit", 90);
    System.out.println();
    System.out.println(A+"\n");

    if(A.containsKey("Maths"))
    {
        System.out.println("Maths is present "+"\n");
    }
   }    
}
