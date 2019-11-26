package exercices.fibonacci;

public class FibonacciInternet {
    public static void printFib(int n) {
        int first = 0;
        int next = 1;

        System.out.println("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);

        for(int i = 1; i<=n-2; ++i) {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
        }
    }
}
