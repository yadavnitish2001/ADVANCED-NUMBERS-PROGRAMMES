package Numbers;

import java.util.Scanner;
public class GreatestTwoNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int n=sc.nextInt();
        System.out.println("Enter second Number");
        int m=sc.nextInt();
        if(n>m){
            System.out.println(n+" is greatest");
        } else{
            System.out.println(m+" is greatest");
        }

    }
    
}
