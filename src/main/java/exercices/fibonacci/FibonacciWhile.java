package exercices.fibonacci;

public class FibonacciWhile {
    public static void printFibWhile(int n) {
        int first = 0;
        int next = 1;

        System.out.println("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);

        int i = 1;
        while(i <= n-2) {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }
    }
}
