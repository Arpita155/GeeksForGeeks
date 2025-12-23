package GeeksForGeeks.Arrays.Medium;



import java.util.Arrays;

public class SortLastMElements {

    public static int[] mergeSort(int []arr, int l, int r){
        if(l<r) {
            int mid = (r+l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
        return arr;
    }

    public static void merge(int []a, int l, int m, int r){
        int left =  m-l+1;
        int right = r-m;
        int []la = new int[left];
        int []ra = new int[right];
        for(int i=0;i<left;i++){
            la[i]=a[l+i];
        }

        for(int i=0;i<right;i++){
            ra[i]=a[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<left && j<right){
            if(la[i]<ra[j]){
                a[k++]=la[i++];
            }
            else {
                a[k++]=ra[j++];
            }
        }
        while(i<left) {
            a[k++]=la[i++];
        }
        while(j<right) {
            a[k++]=ra[j++];
        }
    }
    public static void sortLastMelements(int[] nums, int n, int m)
    {
        // Code here
        System.out.println(Arrays.toString(mergeSort(nums,n,nums.length-1)));
    }

    public static void main(String[] args) {
        int []nums = {1, 3, 6, 19, 11, 16};
        int n = 3;
        int m = 3;
        sortLastMelements(nums,n,m-1);
    }
}
