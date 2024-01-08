package Numbers;

import java.util.Scanner;

public class BooleanCheckPrime {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for checking prime or not ?");
        int n=sc.nextInt();
        boolean res=Isprime(n);
        if(res==true){
            System.out.println(n+" is  prime");
        }
        else{
            System.out.println(n+ " is not Prime");
        }
     }
    public static boolean Isprime(int n){
        if(n==1 || n==0){
            return false;
        }
        else if(n==2){
            return true;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }

    }
}

