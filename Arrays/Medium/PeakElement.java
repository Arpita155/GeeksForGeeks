package GeeksForGeeks.Arrays.Medium;

public class PeakElement {

    public static int peakElement(int[] arr) {
        // code here
        int n= arr.length;
        if(n==1)
            return 0;
        if(arr[0]>arr[1])
            return 0;

        if(arr[n-1]>arr[n-2])
            return n-1;

        int low=1, high=n-2, mid=0;
        while(low<=high)
        {
            mid= (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])
                low=mid+1;
            else
                high=mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakElement(arr));   // ans : true      Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].

    }
}
