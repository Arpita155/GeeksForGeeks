package GeeksForGeeks.BasicQustionsOnJava.Easy;

//Q. Given N number of square blocks. The height of each square block is 1. The task is to create a  staircase of max height using these blocks.
//Note: The first stair would require only one block, the second stair would require two blocks and so on.
public class MaximumHeightOfAStairCase {

    public static int maxStairHeight(int N) {
        // code here
        int max = 1;
        int count = 1;
        int ans = count;
        while(max <= N){
            ans = count;
            count++;
            max = (count * (count+1)) / 2;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Maximum height = "+maxStairHeight(10));   // ans = 4
    }
}
