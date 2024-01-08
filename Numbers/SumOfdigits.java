package Numbers;

import java.util.Scanner;
public class SumOfdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers for finding the sum of digits");
        int n=sc.nextInt();
       int res= SumDigits(n);
       System.out.println("The sum of digits is "+res);
    }
    public static int SumDigits(int n){
        int sum=0,digit;
        while(n!=0){
        digit=n%10;
        sum=sum+digit;
        n=n/10;
        }
        return sum;
    }
    
}
