package GeeksForGeeks.Matrix;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        // code here
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            sum += matrix[i][matrix.length-i-1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int [][]M = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        System.out.println(diagonalSum(M));  // 6
    }
}
