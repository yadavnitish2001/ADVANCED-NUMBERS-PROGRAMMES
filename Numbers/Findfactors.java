package Numbers;

import java.util.Scanner;

public class Findfactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the factors");
        int n=sc.nextInt();
        System.out.println("The factors of number "+n +":");
        for(int i=1;i<=n;i++){
            boolean result=findfactors(n,i);
             if(result==true){
            System.out.print(i+" ");
        }
    }
        }
       
    public static boolean findfactors(int n,int i){
            if(n%i==0){
                return true;
            }
        return false;
    }
}
