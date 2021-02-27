package Java;
import java.util.*;
public class digits {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3 Digit Number :");
        int n=sc.nextInt();
        System.out.println("Digits are");
        while(n!=0)
        {
            int r=n%10;
            System.out.print(r+" ");
            n=n/10;
        }
    }
}
