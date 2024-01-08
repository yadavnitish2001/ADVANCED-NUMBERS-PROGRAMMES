package Numbers;

import java.util.Scanner;

public class RangePrime {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ?");
        int n1=sc.nextInt();
        System.out.println("Enter the number for upto ?");
        int n2=sc.nextInt();
        System.out.println("The prime numb er is:");
        for(int i=n1;i<=n2;i++){
              boolean res=Isprime(i);
            if(res==true){
            System.out.print(i+" ");
        }
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
