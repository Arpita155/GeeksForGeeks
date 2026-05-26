package GeeksForGeeks.Arrays.Easy;

public class MinimumToggleToPartition {

    public static int minToggle(int[] arr) {
        // code here
        int n = arr.length;

        // Count total number of 0s in the array
        int totalZeros = 0;
        for (int num : arr) {
            if (num == 0) {
                totalZeros++;
            }
        }


        int currentToggles = totalZeros;
        int minToggles = currentToggles;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                currentToggles++;
            } else {
                currentToggles--;
            }

            minToggles = Math.min(minToggles, currentToggles);
        }

        return minToggles;
    }

    public static void main(String[] args) {
        int[]arr = {1, 0, 1, 1, 0};
        System.out.println("Number of min toggle is : "+minToggle(arr));
    }
}
