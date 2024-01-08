package Numbers;

import java.util.Scanner;

public class friendlypair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  first number to check friendly or not?");
        int n=sc.nextInt();
         System.out.println("Enter the second number to  check friendly or not?");
        int m=sc.nextInt();
        int sum1=Divisor(n);
        int sum2=Divisor(m);
        int res1=sum1/n;
        int res2=sum2/m;
        if(res1==res2){
            System.out.println("Both are Amicanle Number");
        }
        else{
            System.out.println("Both are not Amicable number");
        }
    }
    public static int Divisor(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
         return sum;
    }
       
}
