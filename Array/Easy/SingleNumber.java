package GeeksForGeeks.Arrays.Easy;

//Q. Given an array arr[] of positive integers where every element appears even times except for one.
// Find that number occurring an odd number of times.
public class SingleNumber {

    public static int getSingle(int []arr) {

        // code here
        int ans = 0;
        int result = 0;
        for(int num : arr){
            ans = ans^num;
            if(ans != 0){
                result = ans;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {8, 8, 7, 7, 6, 6, 1};

        System.out.println(getSingle(arr));   // 1
    }
}
