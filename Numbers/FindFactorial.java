package Numbers;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int num = sc.nextInt();
        
        long fact = factorial(num);
        System.out.println("Factorial of " + num + ": " + fact);
        
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
