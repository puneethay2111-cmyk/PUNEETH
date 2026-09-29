public class InheritanceDemo 
{
    public static void main(String[] args) 
    {
        Dog dog = new Dog();
        dog.makeSound(); 
        dog.name = "Buddy";
        System.out.println(dog.name+" ");
        dog.breed = "Golden Retriever";
        System.out.println(dog.breed+" ");
        dog.age = 8;
        System.out.println(dog.age+"\n ");
        
        Cat cat = new Cat();
        cat.makeSound();
        cat.name = "Whiskers";
        System.out.println(cat.name);
        cat.breed = "Siamese";
        System.out.println(cat.breed+" ");
        cat.age = 9;
        System.out.println(cat.age+" ");
    }
}

class Animal 
{
    String name;
    String breed;
    int age;
}
class Dog extends Animal 
{
    void makeSound()
    {
        System.out.println("woof ");
    }
}
class Cat extends Animal 
{
    void makeSound()
    {
        System.out.println("meow ");
    }
}