import java.util.HashSet;

public class SetsDemo 
{  
   public static void main(String args[]) 
   {
    HashSet<String> movies=new HashSet<String>();
    movies.add("KGF chapter 2");
    movies.add("RRR");
    movies.add("KGF chapter 2");
    movies.add("Bahubali");

    System.out.println(movies);
   }
}
