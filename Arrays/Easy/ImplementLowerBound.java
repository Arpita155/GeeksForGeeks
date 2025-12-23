package GeeksForGeeks.Arrays.Easy;

// Find ou the index which is greater or equal to the target element.  else return the array length.
public class ImplementLowerBound {

    public static int lowerBound(int[] arr, int target) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                return i;
            }
        }

        return arr.length;
    }

    public static void main(String[] args) {
        int []arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 100;
        System.out.println(lowerBound(arr,target));  // 7

        int[] arr1 = {2, 3, 7, 10, 11, 11, 25};
        int t = 9;
        System.out.println(lowerBound(arr1,t));  //  3
    }
}
