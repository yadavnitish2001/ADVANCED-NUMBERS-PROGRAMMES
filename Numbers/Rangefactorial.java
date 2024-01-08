package Numbers;

import java.util.Scanner;

public class Rangefactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number find upto factorial");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            long fact = factorial(i);
            System.out.println("Factorial of " + i + ": " + fact);
        }
    }
    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
             return n*factorial(n-1);
        }
    }
    
}
