package Java;
import java.util.*;
public class prime {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,k=0,i;
        System.out.println("Enter a Number :");
        n=sc.nextInt();
        i=2;
        while(i<=n/2){
            if(n%i==0)
            {
                k=1;
                break;
            }
        }
        if(k==1)
        System.out.println("Not Prime");
        else
        System.out.println("Prime");
    }
}
