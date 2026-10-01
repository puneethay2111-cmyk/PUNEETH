import java.util.Scanner;

public class MenuDrivenExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int userChoice = 0;

        while (userChoice != 3) {
            System.out.println("Enter your calculator choice");
            System.out.println("1. add");
            System.out.println("2. sub");
            System.out.println("3. ex");
            
            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Enter num1\n");
                    int num1 = sc.nextInt();
                    System.out.println("Enter num2\n");
                    int num2 = sc.nextInt();
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) + "\n");
                    break;
                case 2:
                    System.out.println("Enter num1\n");
                    int num3 = sc.nextInt();
                    System.out.println("Enter num2\n");
                    int num4 = sc.nextInt();
                    System.out.println(num3 + "-" + num4 + "=" + (num3 - num4) + "\n");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        
        sc.close();  
    }
}