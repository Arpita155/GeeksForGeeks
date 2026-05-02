package GeeksForGeeks.Arrays.Hard;

public class GeekyBuildings132 {

    public static boolean recreationalSpot(int[] arr, int n) {
        // Your code goes here

        if(n<3)return false;
        int maxi=arr[1];
        int mini=arr[0];
        for(int i=2;i<n;i++){
            if(arr[i]<maxi && arr[i]>mini)return true;
            maxi=Math.max(arr[i],maxi);
            if(mini>arr[i-1] && arr[i-1]!=maxi)mini=arr[i-1];
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 6;
        int[]arr = {4, 7, 11, 5, 13, 2};
        System.out.println("Is such geeky buildings possible : "+recreationalSpot(arr,n));   // true
    }
}
