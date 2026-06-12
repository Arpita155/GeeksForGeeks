package GeeksForGeeks.Arrays.Medium;

public class BinarySearchableCount {

    public static int binarySearchable(int[] arr) {
        // code here
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (canBeFound(arr, arr[i])) {
                count++;
            }
        }

        return count;
    }

    private static boolean canBeFound(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[]arr = {1,3,2};
        System.out.println(binarySearchable(arr));

    }
}
