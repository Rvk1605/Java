package Java;
import java.util.*;
public class sum {
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter A 3 Digit Number :");
       int n=sc.nextInt();
       int sum=0;
       while(n!=0){
           int r=n%10;
           sum=sum+r;
           n=n/10;
       }
       System.out.print("Sum :"+sum);

    }
    
}
