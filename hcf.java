package Java;
import java.util.*;
public class hcf {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int a,b,hcf=1,i=2;
        System.out.print("Enter two numbers :");
        a=sc.nextInt();
        b=sc.nextInt();
        int loop;
        if(a<b)
        loop=a;
        else
        loop=b;
        while(i<=loop)
        {
            if(a%i==0 && b%i==0){
                hcf=hcf*i;
                a=a/i;
                b=b/i;
            }
            else
            i++;
        }
        System.out.print("HCF :"+hcf);
    }   
}
