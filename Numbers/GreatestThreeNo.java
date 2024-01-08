package Numbers;

import java.util.Scanner;

public class GreatestThreeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int n=sc.nextInt();
        System.out.println("Enter second  Number");
        int m=sc.nextInt();
        System.out.println("Enter third Number");
        int o=sc.nextInt();
        if(n>m && n>o){
            System.out.println(n+" is greatest");
        }
        else if(m>n && m>0){
            System.out.println(m+" is greatest");
        }
        else{
            System.out.println(o+" is greatest");
        }
    }
    
}
