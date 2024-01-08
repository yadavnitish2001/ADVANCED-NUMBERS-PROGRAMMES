package Numbers;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if(isfactor(n)){
            System.out.println(n+" is Abundant Number");
        }
        else{
            System.out.println(n+ " Not Abundant Number");
        }
    }
    public static boolean isfactor(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum>n){
            return true;
        }
        return false;
    }
    
}
