public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
        InheritClass obj = new InheritClass();
        obj.printSomething();
    }
}

interface InterfaceDemo1 
{
    public void printSomething();
}

interface InterfaceDemo2 
{
    public void printSomething();
}

class InheritClass extends ParentParent implements InterfaceDemo1, InterfaceDemo2 
{
    public void printSomething()
 {
        System.out.println("Printing Something");
    }
}

class ParentParent 
{
}