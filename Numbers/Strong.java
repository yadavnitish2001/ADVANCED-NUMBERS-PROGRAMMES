package Numbers;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check Strong or not ?");
        int n=sc.nextInt();
        int res=getSum(n);
        if(res==n){
            System.out.println(n+" is Strong number");
        }
        else{
             System.out.println(n+" is not Strong number");
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
