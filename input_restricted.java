package Java;
import java.util.*;
public class input_restricted {
    public static void main(String []args){
        int arr[]=new int[10],flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<10;)
        {
            flag=0;
            int x=sc.nextInt();
            for(int j=0;j<=i;j++)
            {
                if(arr[j]==x)
                {
                    System.out.println("Element Exists");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            arr[i++]=x;
        }
        System.out.println("Array Elements ");
        for(int i=0;i<10;i++)
        System.out.print(arr[i]+" ");
    }
}
