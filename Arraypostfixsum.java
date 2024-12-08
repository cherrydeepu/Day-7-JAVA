import java.util.*;
public class Arraypostfixsum{
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int pos[]=new int[a.length];
        pos[5]=a[5];
        for(int i=5;i>a.length;i--)
        pos[i]=pos[i+1]+a[i];
        System.out.println(Arrays.toString(pos));
    }
}