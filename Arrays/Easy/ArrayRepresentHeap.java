package GeeksForGeeks.Arrays.Easy;

// Q. Given an array arr of size n, the task is to check if the given array can be a level order representation of a Max Heap.
public class ArrayRepresentHeap {

    public static boolean countSub(long []arr, long n) {
        // Your code goes here

        for(int i=0;i<n/2;i++){
            int lc=2*i+1;
            int rc=2*i+2;
            if(lc<n && arr[i]<arr[lc])
                return false;
            if(rc<n && arr[i] <arr[rc]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        long[] arr = {90, 15, 10, 7, 12, 2};
        long n = 6;

        System.out.println(countSub(arr,n));   // true
    }
}
