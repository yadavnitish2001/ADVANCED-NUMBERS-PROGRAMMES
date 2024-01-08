package Numbers;

import java.util.Scanner;

public class RangeOfStrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  upto ?");
        int n=sc.nextInt();
        System.out.println("Strong numbers in the range 1 to " + n + ":");
        for(int i=1;i<=n;i++){
            int res=getSum(i);
             if(res==i){
            System.out.println(i+" ");
        }

        }
    }
    public static int factorial(int n){
     int fact=1;
     for(int i=1;i<=n;i++){
        fact=fact*i;
     }
     return fact;
     }    
     public static int getSum(int n){
        int temp=n;
        int sum=0;
        while (temp!=0) {
          int digit=temp%10;
            sum=sum+factorial(digit);
            temp=temp/10;  
        }
        return sum;
     }
    
}
