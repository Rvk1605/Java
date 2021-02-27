package Java;
import java.util.*;
public class primefactor{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int flag=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
            System.out.print("1*");
            continue;
            }
            else if(n%i==0)
            {
                for(int j=2;j<=i/2;j++){
                    flag=0;
                    if(i%j==0)
                        {
                            flag=1;
                            break;
                        }
                }
            }
            if(flag==0)
            System.out.println(i+" *");
        }
    }
}