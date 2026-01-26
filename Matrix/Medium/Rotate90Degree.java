package GeeksForGeeks.Matrix.Medium;

public class Rotate90Degree {

    public static void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        int[][] ans = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[i][n - 1 - j] = mat[n - 1 - j][n - 1 - i];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = ans[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        rotateMatrix(mat);
    }
}
