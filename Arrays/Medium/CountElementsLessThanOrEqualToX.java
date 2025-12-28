package GeeksForGeeks.Arrays.Medium;

public class CountElementsLessThanOrEqualToX {

    public static int countLessEqual(int[] arr, int x) {
        // code here
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int []arr = {4, 5, 8, 1, 3};
        int x = 6;

        System.out.println("Total elements which is less than or equal to x is : "+countLessEqual(arr,x));
    }
}
