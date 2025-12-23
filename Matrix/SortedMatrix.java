package GeeksForGeeks.Matrix;

import java.util.Arrays;

public class SortedMatrix {
    public static int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int []arr = new int[N*N];
        int k =0;
        for(int i=0;i<Mat.length;i++){
            for(int j=0;j<Mat[i].length;j++){
                arr[k++]=Mat[i][j];
            }
        }
        Arrays.sort(arr);
        int l=0;
        for(int i=0;i<Mat.length;i++){
            for(int j=0;j<Mat[i].length;j++){
                Mat[i][j]=arr[l++];
            }
        }
        return Mat;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] Mat = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        for(int i=0;i<Mat.length;i++){
            for(int j=0;j<Mat[i].length;j++){
                System.out.print(Mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
