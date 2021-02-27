package Java;
import java.util.*;
public class interchange {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        for(int i=0;i<9;i++)
        arr[i]=arr[i+1];
        arr[9]=temp;
        System.out.println("After Interching Data");
        for(int i=0;i<10;i++)
        System.out.print(arr[i]+" ");
    }
}
