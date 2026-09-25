public class vowels 
{
    public static void main( String[] args)
    {
        String s="gebggiuhneuiwbh vrui gv";
        char a;
        int cou=0;
        for (int i=0;i<s.length();i++)
        {
           a=s.charAt(i);
           if(a=='a' |a=='e' | a=='i' | a=='o' |a=='u')
           {
            cou++;
           }
        }
        System.out.println("Total no "+""+cou);
    }    
}
