package Numbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check perfect or not?");
        int n=sc.nextInt();
        int res=factor(n);
        if(n==res){
            System.out.println(n+ " is perfect number");
        }
        else{
            System.out.println(n+" is not perfect square");
        }
    }
    public static int factor(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
          return sum;
    }
}
