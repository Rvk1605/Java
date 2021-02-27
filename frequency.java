package Java;
import java.util.*;
public class frequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter No. :");
        int k=sc.nextInt(),c=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]==k)
            c++;
        }
        System.out.println("Frequency of "+k+" is "+c);
        //Sorting
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorting Array");
        for(int i=0;i<10;i++)
        System.out.print(arr[i]+" ");
    }
}
