package Numbers;

import java.util.Scanner;

public class AtmorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check atmorphic ?");
        int n=sc.nextInt();
        boolean res=atmorphic(n);
        if(res==true){
            System.out.println(n+" is Atmorphic number");
        }else{
            System.out.println(n+" is not atmorphic number");
        }
    }
    public static boolean atmorphic(int n){
        int square=n*n;
        while(n!=0){
            if(n%10!=square%10){
                return false;
            }
            n=n/10;
            square=square/10;
        }
        return true;
    }
    
}
