package GeeksForGeeks.Arrays.Easy;

public class FindTransitionPoint {

    // Q. Given a sorted array, arr[] containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed,
    // and before that, only 0 was observed.  If arr does not have any 1, return -1. If array does not have any 0, return 0.
    public static int transitionPoint(int []arr) {
        // code here
        int zero = 0;
        int one = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
        }
        if(zero==0){
            return 0;
        }
        if(one==0){
            return -1;
        }
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int []arr = {0, 0, 0, 1, 1};
        System.out.println(transitionPoint(arr));   // output : 3
    }
}
