package Numbers;

import java.util.Scanner;

public class sumofnatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of 5 natural number is " +sum);
    }
    
}
