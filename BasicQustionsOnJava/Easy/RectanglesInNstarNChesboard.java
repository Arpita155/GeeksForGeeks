package GeeksForGeeks.BasicQustionsOnJava.Easy;

//Q Find total number of Rectangles (excluding squares) in a N*N chessboard.
//Input:
//N = 2
//Output:
//4
//Explanation:
//There are 4 rectangles in a 2*2 chessboard.

public class RectanglesInNstarNChesboard {

    static int rectanglesInChessBoard(int N) {
        // code here
        int total = N*N*(N+1)*(N+1)/4;
        int sqr = N*(N+1)*(2*N+1)/6;
        return total-sqr;
    }

    public static void main(String[] args) {
        System.out.println("There are "+rectanglesInChessBoard(2)+" rectangles in chessboard");
    }
}
