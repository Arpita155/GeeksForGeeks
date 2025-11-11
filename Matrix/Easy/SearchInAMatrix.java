package GeeksForGeeks.Matrix.Easy;

//Q. Given a 2D integer array mat[][] and a number x, find whether element x is present in the matrix or not.
public class SearchInAMatrix {

    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==x){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [][]mat = {{6, 23, 21},{4, 45, 32},{69, 11, 87}};
        int x = 32;

        System.out.println("Is the element present in the matrix : "+searchMatrix(mat,x));
    }
}
