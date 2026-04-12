package GeeksForGeeks.Arrays.Easy;

public class ToeplitzMatrix {

    public static boolean isToeplitz(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;

        // for every element check its top left guy
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] != mat[i-1][j-1]) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][]mat = {{6, 7, 8},
                {4, 6, 7},
                {1, 4, 6}
        };

        System.out.println("Is the matrix teoplitz : "+isToeplitz(mat));
    }
}
