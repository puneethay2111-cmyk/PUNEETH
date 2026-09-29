public class polyDemo3
{
    public static void main(String[] args)
     {
        Snake snake = new Snake();
        snake.makeSound();
    }
}

class Animal 
{
    int name;
    void makeSound() 
    {
        System.out.println("animal sounds");
    }
}

class Snake extends Animal 
{
    void makeSound() 
    {
        System.out.println("SSsssszzzzz");
    }
}