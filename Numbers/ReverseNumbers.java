package Numbers;

import java.util.Scanner;
public class ReverseNumbers {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers for reverse the digits");
        int n=sc.nextInt();
       int res= reverse(n);
       System.out.println("The reverse of numbers is "+res);
    }
    public static int reverse(int n){
        int digit,rev=0;
        while(n!=0){
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
        }
        return rev;
    }
    
}
