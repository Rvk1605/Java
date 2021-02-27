package Java;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int f1=0,f2=1,f,n;
        System.out.print("Enter no. of Terms :");
        n=sc.nextInt();
        System.out.print("0 1");
        for(int i=0;i<n-2;i++)
        {
            f=f1+f2;
            f1=f2;
            f2=f;
            System.out.print(" "+f);
        }
    }
}
