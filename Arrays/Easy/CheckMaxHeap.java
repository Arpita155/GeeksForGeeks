package GeeksForGeeks.Arrays.Easy;

public class CheckMaxHeap {

    public static boolean isMaxHeap(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int lc = 2*i+1;
            int rc = 2*i+2;
            if(lc<n && arr[i]<arr[lc]){
                return false;
            }
            if(rc<n && arr[i]<arr[rc]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[]arr = {90, 15, 10, 7, 12, 2};
        System.out.println("Is it a Max Heap : "+isMaxHeap(arr));   // true
    }
}
