package Numbers;

import java.util.Scanner;

public class findPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        int base=sc.nextInt();
        System.out.println("Enter the power");
        int power=sc.nextInt();
       System.out.println("Answer:"+ Power(base, power));
    }
    public static int Power(int base,int power){
        int res=1;
        for(int i=1;i<=power;i++){
            res=res*power;
        }
        return res;

    }
    
}
