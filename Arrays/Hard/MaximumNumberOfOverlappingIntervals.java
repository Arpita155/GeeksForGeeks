package GeeksForGeeks.Arrays.Hard;

import java.util.Arrays;

public class MaximumNumberOfOverlappingIntervals {

    public static int overlapInt(int[][] arr) {
        // code here
        int n = arr.length;
        int[]start = new int[n];
        int[]end = new int[n];
        for(int i=0;i<n;i++){
            start[i]=arr[i][0];
            end[i]=arr[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i=0, j=0;
        int maxoverlap = 0;
        int currentoverlap = 0;

        while(i<n && j<n){
            if(start[i]<=end[j]){
                currentoverlap++;
                maxoverlap = Math.max(maxoverlap,currentoverlap);
                i++;
            }else{
                currentoverlap--;
                j++;
            }
        }

        return maxoverlap;
    }

    public static void main(String[] args) {
        int[][]arr = {{1, 2}, {2, 4}, {3, 6}};
        System.out.println("Total number of intervals are : "+overlapInt(arr));
    }
}
