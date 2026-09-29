public class polymorphism 
{
   public static void main( String[] args)
   {
        polyOverload poly=new polyOverload();
        poly.welcome();
        poly.welcome("Spiderman");
   }
}
class polyOverload
{
    void welcome()
    {
        System.out.println("welcome to the AIML");
    }
    void welcome (String name)
    {
        System.out.print("welcome"+"  "+name);
    }
}
