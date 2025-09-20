package GeeksForGeeks.Matrix;

public class TwoIdenticalMatrix {
    public static boolean areMatricesIdentical(int[][] Grid1, int[][] Grid2) {
        // code here
        for(int i=0;i<Grid1.length;i++){
            for(int j=0;j<Grid1[i].length;j++){
                if(Grid1[i][j]!=Grid2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][]M1={
                {1,2},
                {3,4}
        };
        int [][]M2={
                {1,2},
                {3,4}
        };
        System.out.println("Two matrix are equal , is it true or false : "+areMatricesIdentical(M1,M2));
    }
}
