package exercices.fibonacci;

public class App {
    public static void main(String[] args) {
        System.out.println("*** Fibonacci with Matei - V1 ***");
        FibonacciMatei.printFibonacci(9);
        System.out.println(" ");

        System.out.println("*** Fibonacci with Matei - V2 ***");
        FibonacciMatei.printFibonacci2(9); // printFibonacci2 mult mai rapid (=eficient) decat printFibnacci
        System.out.println(" ");

        System.out.println("*** Fibonacci from the internet ***");
        FibonacciInternet.printFib(9);
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("*** Fibonacci with while ***");
        FibonacciWhile.printFibWhile(9);
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("*** Fibonacci with recursion ***");
        FibonacciRecursion.printFibRecursion(9);
        System.out.println(" ");
        System.out.println(" ");

    }
}
