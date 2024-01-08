package Numbers;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check Harshad or not?");
        int n=sc.nextInt();
        if(isHarshad(n)){
            System.out.println(n+" is Harshad number");
        }
        else{
            System.out.println(n+" is not Harshad number");
        }
    }
    public static boolean isHarshad(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        if(temp%sum==0){
            return true;
        }
        else{
            return false;
        }
    }
}
