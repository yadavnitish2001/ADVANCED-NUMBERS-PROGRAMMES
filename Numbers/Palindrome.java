package Numbers;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers for find the palindrome");
        int n=sc.nextInt();
       int res= palindrome(n);
       if(res==n){
        System.out.println(n+" is palindrome");
       }
       else{
        System.out.println("Not Palindrome");
       }
    }
    public static int palindrome(int n){
        int digit,rev=0;
        while(n!=0){
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
        }
        return rev;
    }
    
}
