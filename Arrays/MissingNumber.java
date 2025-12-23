package GeeksForGeeks.Arrays;

public class MissingNumber {
    public static int missingNum(int arr[]) {
        // code here

        int n = arr.length + 1;
        long total = (long)n * (n + 1) / 2;
        long sum = 0;
        for (int v : arr){
            sum += v;
        }
        return (int)(total - sum);
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,5};
        System.out.println(missingNum(arr));
    }
}
