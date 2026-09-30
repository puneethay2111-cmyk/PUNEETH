import java.util.ArrayList;

public class ArraylistDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Puneeth");
        nameList.add("Iron Man");
        nameList.add("RDJ");
        nameList.add("Spider Man");
        System.out.println(nameList.get(1)+"\n");
        for(int i=0; i<nameList.size(); i++)
        {
            System.out.println(nameList.get(i));
        }
    }
}