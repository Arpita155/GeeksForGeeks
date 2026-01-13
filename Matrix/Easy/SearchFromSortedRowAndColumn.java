package GeeksForGeeks.Matrix.Easy;

public class SearchFromSortedRowAndColumn {

    public static boolean matSearch(int [][]mat, int x) {
        // your code here
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
        int [][]mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Is the element present in the matrix : "+matSearch(mat,10));
    }
}
