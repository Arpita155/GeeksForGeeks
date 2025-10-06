import java.util.*;

public class ElementsInTheRange {

    public static boolean check_elements(int arr[], int n, int A, int B) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        for(int i=A;i<=B;i++){
            if(!hs.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7, A = 2, B = 5;
        int []arr =  {1, 4, 5, 2, 7, 8, 3};
        System.out.println(check_elements(arr,n,A,B));
    }
}


