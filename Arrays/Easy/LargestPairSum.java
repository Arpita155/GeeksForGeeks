package GeeksForGeeks.Arrays.Easy;

public class LargestPairSum {

    public static int pairSum(int[] arr) {
        // code here
        int firstl = 0;
        int secondl = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstl){
                secondl = firstl;
                firstl = arr[i];
            }
            if(arr[i]>secondl && arr[i]<firstl){
                secondl = arr[i];
            }
        }

        return firstl+secondl;
    }

    public static void main(String[] args) {
        int[]arr = {12, 34, 10, 6, 40};
        System.out.println("Largest sum = "+pairSum(arr));
    }
}
