package exercices.fibonacci;

public class FibonacciRecursion {
    public static void printFibRecursion(int n) {
        int first = 0;
        int next = 1;

        System.out.println("The first " + n + " Fibonacci numbers are: ");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int x) {
        if(x==0) {
            return 0;
        } else if(x==1) {
            return 1;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
}
