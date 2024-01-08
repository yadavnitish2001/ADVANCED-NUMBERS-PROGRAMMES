package Numbers;

import java.util.Scanner;

public class RangeInPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for finding the palindrome number upto n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           if(i==reverse(i))
            System.out.println(i);
        }
        
        }   
    public static int reverse(int n){
        int rev=0,digit;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    
}
