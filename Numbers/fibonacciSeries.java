package Numbers;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to print Fibonacci");
        int n = sc.nextInt();
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int x = 0, y = 1, z = 0;
        while (n > 0) {
            System.out.print(z + " ");
            z = x + y;
            x = y;
            y = z;
            n--;
        }
        System.out.println();
    }
    
}
