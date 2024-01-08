package Numbers;

import java.util.Scanner;

public class RangeArmstrongNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter starting range");
        int n1=Sc.nextInt();
        System.out.println("Enter starting range");
        int n2=Sc.nextInt();
        for(int i=n1;i<=n2;i++){
            int count=Count(i);
            int sum=getSum(i, count);
            if(sum==i)  System.out.println(i);
        }
    }
    public static int Count(int n){
        int count=0;
        while(n!=0){
        count++;
        n=n/10;
    }
    return count;
}
public static int getSum(int n,int count){
    int sum=0;
    while(n!=0){
        int rem=n%10;
        sum=sum+(int)Math.pow(rem, count);
        n=n/10;
    }
    return sum;
}
    
}
