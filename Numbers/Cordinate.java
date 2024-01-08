package Numbers;

import java.util.Scanner;

public class Cordinate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter Second number");
        int y=sc.nextInt();

        if(x>0 && y>0){
            System.out.println(x+" and "+y+" in first quardant");
        }
        else if(x<0 && y>0){
            System.out.println(x+" and "+y+" in second quardant");
        }
        else if(x<0 && y<0){
            System.out.println(x+" and "+y+" in third quardant");
        }
        else{
            System.out.println(x+" and "+y+" in fourth quardant");
        }
    }
    
}
