import java.util.*;
public class Arraypostfixsum{
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int temp[]=new int[n];
        int k=0;
        int sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            temp[k]=sum;
            k++;
        }
        System.out.println(Arrays.toString(temp));

    } 
}
