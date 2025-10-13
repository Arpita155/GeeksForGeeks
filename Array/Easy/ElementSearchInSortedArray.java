package GeeksForGeeks.Arrays.Easy;

//Q. Given an array, arr[] sorted in ascending order and an integer k. Return true if k is present in the array, otherwise, false.
public class ElementSearchInSortedArray {

    static boolean searchInSorted(int []arr, int k) {
        // Your code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 6};
        int k = 6;
        System.out.println(searchInSorted(arr,k));
    }
}
