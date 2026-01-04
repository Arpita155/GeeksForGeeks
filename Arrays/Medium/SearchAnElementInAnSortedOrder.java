package GeeksForGeeks.Arrays.Medium;

public class SearchAnElementInAnSortedOrder {

    public static int findTarget(int arr[], int target) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;

        System.out.println("Index of the target element is : "+findTarget(arr,target));
    }
}
