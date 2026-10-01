import java.util.Scanner;

public class MenuDrivenExample 
{
   public static void main(String [] args)
   {
    int userChouice=0;

    while (userChouice!=3)
    {
        System.out.println("Enter your calculator choice");
        System.out.println("1.add");
        System.out.println("2.sub");
        System.out.println("3.ex");
        System.out.println("\n ");
        Scanner sc=new Scanner(System.in);
        userChouice=sc.nextInt();

        switch ((userChouice)) {
            case 1:
                {
                    add();
                    break;
                }
            case 2:
                {
                    System.out.println("Enter num1"+"\n");
                    int num1=sc.nextInt();
                    System.out.println("Enter num2"+"\n");
                    int num2 =sc.nextInt();
                    System.out.print(num1+" + "+num2+"="+(num1+num2)+" \n");
                    break;
                }
                case 3:
                    {
                        System.out.print("Thank you"+" ");
                        break;
                    }
                default :
                    {
                        System.out.print("Invalid option.\n");
                    }
        }
    }
   }
   private static void add()
   {
    System.out.print("enter num1"+"\n");
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    System.out.print("enter num2"+"\n");
    int num2=sc.nextInt();
    System.out.print(num1+"+"+num2+"="+(num1+num2)+"\n ");
   }
}
