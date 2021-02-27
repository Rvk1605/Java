package Java;
import java.util.*;
public class Max_in_array {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10],max=-99999;
        System.out.println("Enter Elements ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.print("Max Number :"+max);
    }
}
