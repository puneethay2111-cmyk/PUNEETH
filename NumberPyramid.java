public class NumberPyramid 
{public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // Print stars separated by spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
