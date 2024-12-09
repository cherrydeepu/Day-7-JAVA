import java.util.*;
public class Withoutusingtempvariable{
    public static void main(String args[]){
        int a[]={11,12,3,4,3};
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
          int res=s/(i+1);
            a[i]=res;
        }
        System.out.println(Arrays.toString(a));
    }
}