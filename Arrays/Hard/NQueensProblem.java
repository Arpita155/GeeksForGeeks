package GeeksForGeeks.Arrays.Hard;

import java.util.ArrayList;

public class NQueensProblem {

    public static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int[][]board = new int[n][n];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();   // // List to store all valid solutions
        findPosition(board,0,n,result);

        return result;
    }

    public static void findPosition(int[][]board, int col, int n, ArrayList<ArrayList<Integer>> result){
        // base case
        if(col == n){     // All queens are placed successfully
            // Store the current board configuration as a list of column positions
            ArrayList<Integer> currentSolution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1) {
                        currentSolution.add(j + 1); // Use 1-based indexing for output as per common problem constraints
                    }
                }
            }
            result.add(currentSolution);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                findPosition(board,col+1,n,result);   // Recurse for next column
                board[row][col]=0;           // Backtrack(remove queen)
            }
        }
    }

    public static boolean isSafe(int[][]board,int row, int col){
        // top-left checking
        int i = row;
        int j = col;
        while(i>=0 && j>=0){
            if(board[i][j]==1){
                return false;
            }
            i--;
            j--;
        }

        // left checking
        i=row;
        j=col;
        while(j>=0){
            if(board[i][j]==1){
                return false;
            }
            j--;
        }

        // bottom-left checking
        i=row;
        j=col;
        while(i<board[0].length && j>=0){
            if(board[i][j]==1){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(nQueen(4));    // Output :  [[3, 1, 4, 2], [2, 4, 1, 3]]
    }
}
