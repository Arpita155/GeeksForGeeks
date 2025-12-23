package GeeksForGeeks.Arrays.Easy;

public class BinarySearch {

    public static int binarysearch(int[] arr, int k) {
        // Code Here
        int low=0;
        int high=arr.length-1;
        int res=-1;

        while(low <= high){
            int mid=low+(high-low)/2;

            if(arr[mid]==k){
                res=mid;
                high=mid-1;
            } else if (arr[mid]<k){
                low=mid+1;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int n = 4;
        System.out.println(binarysearch(arr,n));    //output : 3
    }
}
