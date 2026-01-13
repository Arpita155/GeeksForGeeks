package GeeksForGeeks.Matrix.Medium;

import java.util.ArrayList;

public class SumOfUpperAndLowerTriangle {

    public static ArrayList<Integer> sumTriangles(int [][]mat) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[i].length;j++){
                sum += mat[i][j];
            }
        }
        al.add(sum);
        sum=0;
        for(int i=mat.length-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                sum += mat[i][j];
            }
        }
        al.add(sum);
        return al;
    }

    public static void main(String[] args) {
        int [][]mat = {{1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(sumTriangles(mat));    //[26, 34]
    }
}
