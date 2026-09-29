import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("USN: ");
        String usn = sc.nextLine();

        System.out.print("Age:  ");
        int age = sc.nextInt();

        System.out.println("\nName: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Age: " + age);
        sc.close();
    }
}