package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumOccurredInteger {

    public static int maxOccurred(List<Integer> L, List<Integer> R) {
        // code here

        // ------ Naive Approach --------  T.C = O(len[R] * Rmax) S.C = O(Rmax)
        /*int Rmax = 0;
        for(int i=0;i<R.size();i++){
            if(R.get(i) > Rmax){
                Rmax = R.get(i);
            }
        }

        int[] a = new int[Rmax+1];
        for(int i=0;i<L.size();i++){
            for(int j=L.get(i);j<=R.get(i);j++){
                a[j]++;
            }
        }

        int maxfreq = 0;
        int resultIndex = 0;
        for(int i=1;i<a.length;i++){
            if(a[i] > maxfreq){
                maxfreq = a[i];
                resultIndex = i;
            }
        }
        return resultIndex;*/

        // ------- Efficient Approach -------- T.C = O(len[R] + Rmax) S.C = O(Rmax)
        int Rmax = 0;
        for(int i=0;i<R.size();i++){
            if(R.get(i) > Rmax){
                Rmax = R.get(i);
            }
        }

        int[] a = new int[Rmax+2];
        for(int i=0;i<L.size();i++){
            a[L.get(i)]++;
            a[R.get(i)+1]--;
        }
        int max = 0;
        int idx = 0;
        for(int i=1;i<a.length;i++){
            a[i]=a[i]+a[i-1];
            if(a[i] > max){
                max = a[i];
                idx = i;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>(Arrays.asList(1,4,3,1));
        List<Integer> R = new ArrayList<>(Arrays.asList(15,8,5,4));

        System.out.println("Index of the maximum element is : "+maxOccurred(L,R));
    }
}
