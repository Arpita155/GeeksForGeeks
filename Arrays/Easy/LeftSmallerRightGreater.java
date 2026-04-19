package GeeksForGeeks.Arrays.Easy;

public class LeftSmallerRightGreater {

    public static int findElement(int[] arr) {
        // code here

        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left[i] =Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--)
        {
            right[i]=Math.min(right[i+1],arr[i]);
        }
        for (int i=1;i<n-1;i++)
        {
            if(arr[i]>=left[i-1]&&arr[i]<=right[i+1])
            {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr = {4,2,5,7};
        System.out.println(findElement(arr));
    }
}
