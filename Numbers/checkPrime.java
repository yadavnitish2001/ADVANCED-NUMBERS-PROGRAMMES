package Numbers;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter trhe number for checking prime or not ?");
        int n=sc.nextInt();
        Prime(n);
    }
    public static void Prime(int n){
        if(n<=1 ){
            System.out.println(n+" is prime number");
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%2==0){
                count++;
            }
        }
            if(count>=2){
                System.out.println(n+" is not prime number");
            }
            else{
                System.out.println(n+" is prime number");
            }
    }
    
}
