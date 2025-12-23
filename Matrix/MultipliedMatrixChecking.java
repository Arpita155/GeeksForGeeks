package GeeksForGeeks.Matrix;

public class MultipliedMatrixChecking {
    static boolean multiplyMatrix(int mat1[][], int mat2[][], int result[][]) {
        // code here
        int [][]mult = new int [4][4];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                for(int k=0;k<mat1[i].length;k++){
                    mult[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                if(mult[i][j]!=result[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][]M1= {
                {1, 2, 3, 4},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        int [][]M2= {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        int [][]R= {
                {1, 2, 3, 4},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        System.out.println(multiplyMatrix(M1,M2,R));
    }
}
