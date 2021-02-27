package Java;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String s[]=new String[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Strings");
        for(int i=0;i<5;i++)
        {
            s[i]=sc.next();
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.println(s[i]);
        } 
    }
    
}
