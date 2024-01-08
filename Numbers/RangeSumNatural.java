package Numbers;

import java.util.Scanner;

public class RangeSumNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=sc.nextInt();
        System.out.println("Enter the number upto");
        int n2=sc.nextInt();
        sumNaturalNumber(n1, n2);
    }
    public static void sumNaturalNumber(int n1,int n2){
        int sum=0;
        for(int i=n1;i<=n2;i++){
            sum+=i;
        }
        System.out.println("The sum of first natural number is "+sum);
    }
}
