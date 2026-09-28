public class factorial {
    public static void main(String[] args) {
        int num = 5;
        // Calling the recursive method and printing the result
        int result = fact(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

    // Move 'fact' outside of main, directly inside the class
    static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }
}