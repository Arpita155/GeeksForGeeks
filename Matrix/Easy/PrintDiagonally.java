package GeeksForGeeks.Matrix.Easy;

import java.util.ArrayList;

public class PrintDiagonally {

    public static ArrayList<Integer> diagonalView(int [][]mat) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=mat.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int r=i;
                int k=j;
                if(mat[r][k]==-1) continue;
                while(r>=0 && r<n && k>=0 && k<n){
                    ans.add(mat[r][k]);
                    mat[r][k]=-1;
                    r++;
                    k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][]mat = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}
        };

        System.out.println(diagonalView(mat));
    }
}
