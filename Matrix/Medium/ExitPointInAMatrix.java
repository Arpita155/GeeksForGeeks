package GeeksForGeeks.Matrix.Medium;

import java.util.Arrays;
import java.util.List;

public class ExitPointInAMatrix {

    public List<Integer> exitPoint(int[][] mat) {
        // code here
        int n = mat.length, m = mat[0].length;
        int r = 0, c = 0, d = 0;

        while (r >= 0 && r < n && c >= 0 && c < m) {
            if (mat[r][c] == 1) {
                d = (d + 1) % 4;
                mat[r][c] = 0;
            }
            if (d == 0) c++;
            else if (d == 1) r++;
            else if (d == 2) c--;
            else r--;
        }

        return Arrays.asList(
                r < 0 ? 0 : (r >= n ? n - 1 : r),
                c < 0 ? 0 : (c >= m ? m - 1 : c)
        );
    }
    public static void main(String[] args) {
        int[][] mat = {{0,1,0},{0,1,1},{0,0,0}};
        System.out.println(new ExitPointInAMatrix().exitPoint(mat));
    }
}
