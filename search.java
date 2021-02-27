package Java;

import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("Enter Elements: ");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to be Searched :");
        int k=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(arr[i]==k)
            {
            System.out.println("Number Found");
            return;
            }
        }
        System.out.println("Number Not Found");
        
    }

    
}
