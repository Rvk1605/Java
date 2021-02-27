package Java;

import java.util.*;
public class divisible_by {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("Enter Elements: ");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Number Divisible by 5 are");
        for(int i=0;i<10;i++)
        {
            if(arr[i]%5==0)
            System.out.println(arr[i]);
        }
        
    }

    
}
