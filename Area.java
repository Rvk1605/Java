package Java;

import java.util.Scanner;
public class Area {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 3 Sides of Triangle :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int s = (a+b+c)/2;
        int area=s*(s-a)*(s-b)*(s-c);
        Math.sqrt(area);
        System.out.print("Area :" +area);
        
    }
    
}
