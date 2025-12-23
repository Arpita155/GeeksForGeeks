package GeeksForGeeks.Arrays.Easy;

//Q. You have given two sorted arrays arr1[] & arr2[] of distinct elements.
// The first array has one element extra added in between. Return the index of the extra element.
//
//Note: 0-based indexing is followed.

public class IndexOfAnExtraElement {

    public static int findExtra(int []a, int []b) {
        // add code here.

        int n = a.length;
        int m = b.length;
        int res = 0;
        for(int i=0;i<Math.min(n,m);i++){
            if(a[i]!= b[i]){
                res = i;
                return res;
            }
        }
        if(n>m){
            return n-1;
        }else{
            return m-1;
        }

    }

    public static void main(String[] args) {

        int[]a = {2,4,6,8,9,10,12};
        int []b = {2,4,6,8,10,12};

        System.out.println("Index of the extra element is : "+findExtra(a,b));    // 4
    }
}
