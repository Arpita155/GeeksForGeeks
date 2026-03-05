package GeeksForGeeks.Arrays.Hard;

public class NumberOfSubSetWithProductLessThanK {

    public static int numOfSubsets(int[] arr, int k) {
        // code here
        return findSubset(arr,1,0,k) - 1;  // to exclude empty subset from the answer-1 is used.
    }

    public static int findSubset(int[]arr,int prd,int counter,int k){
        if (counter == arr.length) {
            return (prd <= k) ? 1 : 0;
        }
        int count = findSubset(arr, prd,counter + 1, k);
        if (prd * arr[counter] <= k) {
            count += findSubset(arr, prd * arr[counter], counter + 1, k);
        }

        return count;
    }

    public static void main(String[] args) {
        int[]arr = {2,4,5,3};
        int k = 12;
        System.out.println("Number of total subset with product less than k is : "+(findSubset(arr,1,0,k)-1));
    }
}
