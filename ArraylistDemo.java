import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Puneeth");
        nameList.add("Iron Man");
        nameList.add("RDJ");
        nameList.add("Spider Man");
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(34);
        nums.add(34);
        nums.add(34);
        System.out.println();
        System.out.println(nums+"\n");    
        System.out.println(nameList.get(0)+"\n");

        for(int i=0; i<nameList.size(); i++)
        {
            System.out.println(nameList.get(i));
        }
    }
}