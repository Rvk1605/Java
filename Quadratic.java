package Java;
import java.util.Scanner;
public class Quadratic {
    public static void main(String []args) {
        int a,b,c;
        System.out.print("Enter a,b,c :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int dis=(b*b)-(4*a*c);
        float r1,r2;
        if(dis>0)
        {
            System.out.print("Roots are Real and Distinct");
            Math.sqrt(dis);
            r1=(-b+dis)/2*a;
            r2=(-b-dis)/2*a;
            System.out.println("r1 :"+r1);
            System.out.println("r2 :"+r2);
        }
        else if(dis==0)
        {
            System.out.println("Roots are Real and Equal");
            Math.sqrt(dis);
            r1=(-b+dis)/2*a;
            System.out.println("r :"+r1);
        }
        else
        {
            System.out.print("Roots are Imaginary ");
        }
    }
}
