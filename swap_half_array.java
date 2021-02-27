package Java;
import java.util.Scanner;
public class swap_half_array {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter Elements ");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0,j=9;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("After Swapping");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
