package GeeksForGeeks.Matrix;

public class SquaresInAMatrix {

    // Q. Given a mxn matrix, count the number of squares in the matrix.
    // Explanation :- There are a total of 5 squares in a 2*2 matrix. Four 1*1 squares and one 2*2 square.

    static int squaresInMatrix(int m, int n) {
        // code here
        int sum = 0;
        if(m==0 && n==0){
            return 0;
        }
        else{
            while(m>=1 && n>=1){
                sum += m--*n--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int M =4;
        int N =3;
        System.out.println(squaresInMatrix(M,N));   // 20
    }
}
