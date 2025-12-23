package GeeksForGeeks.Arrays.Easy;

public class SquareRoot {

    //Q. Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
    //Floor value of any number is the greatest Integer which is less than or equal to that number.
    public static int floorSqrt(int n) {
        // code here
        int low=0;
        int high=n;

        while(low <= high){
            int mid=low+(high-low)/2;

            if(mid*mid==n){
                return mid;
            } else if (mid*mid<n){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(floorSqrt(n));  // Output : For N = 11 output is 3.
    }
}
