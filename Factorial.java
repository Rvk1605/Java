package Java;

import java.util.Scanner;
public class Factorial {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a Number :");
        n=sc.nextInt();
        int f=1;
        while(n!=0){
            f=f*n--;
        }
        System.out.println("Factorial :"+f);
    }
}
