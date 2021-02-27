package Java;

import java.util.*;
public class Power {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter x: ");
        int x=sc.nextInt();
        System.out.print("Enter Y :");
        int y=sc.nextInt();
        System.out.println(Math.pow(x,y));
    }
}
