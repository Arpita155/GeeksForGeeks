package GeeksForGeeks.Arrays;
import java.util.*;
public class CheckEqualArrays {

    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int flag = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                flag =1;
            }
        }
        if(flag == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int [] a  = {1, 2, 5, 4, 0};
        int []b = {2, 4, 5, 0, 1};
        System.out.println("Both the arrays are equal size : "+checkEqual(a,b));
    }
}
