package Java;
import java.util.Scanner;

public class Swap {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter two Numbers :");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("a :"+a +" \nb :" +b);
    }
}
