package Java;

import java.util.*;
public class CI {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal Amount :");
        int p=sc.nextInt();
        System.out.print("Enter Rate :");
        int r=sc.nextInt();
        System.out.print("Enter Time :");
        int t=sc.nextInt();
        int CI= (int) (p * Math.pow((1 + r), t))-p;
        System.out.print("Interest Amount :"+CI);

    }
}
