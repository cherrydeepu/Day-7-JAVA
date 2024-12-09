import java.util.*;
public class withtempvariable{
    public static void main(String args[]){
        int arr[]={12,13,1,5,7};
        int temp[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int c=sum/(i+1);
            temp[i]=c;
        }
        System.out.println(Arrays.toString(temp));
    }
}