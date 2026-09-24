

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[]args)
    {
        int a =10;
        System.out.println(a++ + ++a);
        System.out.println(a);

       

        

      
    }
    static void test3()
    {
        //Ternary operator
        int num1 = 780;
        int num2 = 30;
        String output = num1 > num2 ? "num1 is greater " : "num2 is greater ";
        System.err.println(output);

    }
    static void test4() {


        int a = 10;
        a += 5;
        System.out.println(a);
        
    }
  static void test5(){
      int a = 100;
     
      System.out.println(a);
      ++a;
      System.out.println(a++);
      System.out.println(a);
      a--;
      System.out.println(a);
      System.out.println(--a);

}
 static void Big3(){
    
    System.out.println("Enter the value of A\n");
    int num1 = sc.nextInt();
    System.out.println("Enter the value of B\n");
    int num2 =sc.nextInt();
    System.out.println("Enter the value of c\n");
    int num3 = sc.nextInt();
    int round1 = num1 > num2 ? num1 : num2 ;
    String round = num1 > num2 ? "A" : "B" ;
    String round2 = round1 > num3 ? round  : "C";
   
   
    System.out.println(round2+" is Greater");
    
 }

 static void agecal(){
   
    System.out.println("Enter you DOB year");
    int age = sc.nextInt();
    age = 2026-age;
    System.out.println("Your age is "+age);
    
 }
 static void cels(){
    
    System.out.println("Enter degree in Celsious");
    int cel = sc.nextInt();
    int fah = cel*9/5+32;
    System.out.println("Fahrenheit is "+fah);
  
 }

}