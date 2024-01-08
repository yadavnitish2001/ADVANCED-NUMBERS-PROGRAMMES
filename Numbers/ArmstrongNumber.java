package Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check armstrong or not");
        int num=sc.nextInt();
        int pow=checkArmstrong(num);
        int res=getSum(num, pow);
        if(num==res){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
    public static int checkArmstrong(int num){
        int count=0;
        while(num!=0){
        count++;
        num=num/10;
        }
        return count;
    }
    public static int getSum(int num,int power){
        int sum=0;
        while(num!=0){
        int digit=num%10;
        int value=(int)Math.pow(digit, power);
        sum=sum+value;
        num=num/10;
        }
        return sum;
    }
}
