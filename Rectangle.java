package Java;
import java.util.Scanner;
public class Rectangle {
    public static void main(String []args) 
    {
        Scanner sc= new Scanner(System.in);
        int l,b;
        System.out.print("Enter Length :");
        l=sc.nextInt();
        System.out.print("Enter Breadth :");
        b=sc.nextInt();
        System.out.print("Area :" +l*b);
    }  
}
