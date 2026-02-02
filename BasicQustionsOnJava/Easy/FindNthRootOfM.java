package GeeksForGeeks.BasicQustionsOnJava.Easy;

//Q. You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then return -1.
public class FindNthRootOfM {

    public static int nthRoot(int n, int m) {
        // code here
        int start=0;
        int end=m;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Math.pow(mid,n)==m)return mid;
            else if(Math.pow(mid,n)<m)start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 8;
        System.out.println(nthRoot(n,m));    // 2
    }
}
