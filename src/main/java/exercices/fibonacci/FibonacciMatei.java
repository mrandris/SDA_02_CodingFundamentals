package exercices.fibonacci;

public class FibonacciMatei {
    //  9. Write a function that takes an integer n as argument and prints the first n numbers in the Fibonacci sequence (1, 1, 2, 3, 5, 8, etc..)
    public static void printFibonacci(int n) {
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < n; i++) {
//            System.out.println("F(i-2)= " + fibonacci[i-2]);
//            System.out.println("F(i-1)= " + fibonacci[i-1]);
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
//            System.out.println("F(i)= " + fibonacci[i]);
        }

/*        for (int j : fibonacci) {
            int i = 0;
            i=i+1;
            System.out.println("F("+ i +")=" + j);
        }*/

        for(int i = 0; i<fibonacci.length; i++) {
            System.out.print("i=" + i + " ");
            System.out.println("F("+ i +")=" + fibonacci[i]);
        }
    }
    // printFibonacci2 e mult mai rapid, ca nu tine minte toate valorile arrayului Fibonacci in memorie
    public static void printFibonacci2(int n) {
        int penultim = 0;
        int ultim = 1;
        System.out.println("i=0 F(0)=" + penultim);
        System.out.println("i=1 F(1)=" + ultim);
        for (int i = 2; i < n; i++) {
            int curent = penultim + ultim;
            System.out.print("i=" + i + " ");
            System.out.println("F("+ i +")=" + curent);
            penultim = ultim;
            ultim = curent;
        }
    }
}
