package GeeksForGeeks.Matrix;

public class SumOfIthRowAndIthColumn {
    public static int sumOfRowCol(int N, int M, int [][]A) {
        // code here
        int limit = Math.min(N, M);
        for(int i=0;i<limit;i++){
            int RowSum = 0;
            int ColumnSum = 0;
            for(int j=0;j<M;j++){
                RowSum += A[i][j];
            }
            for(int j=0;j<N;j++){
                ColumnSum += A[j][i];

            }
            if(RowSum != ColumnSum){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int N=2;
        int M=2;
        int [][]A={
                {1,2},
                {2,1}
        };
        System.out.println(sumOfRowCol(N,M,A));
    }
}
