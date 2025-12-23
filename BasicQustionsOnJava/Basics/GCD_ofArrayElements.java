package GeeksForGeeks.BasicQustionsOnJava.Basics;

//Q. Given an array of n positive integers, find the GCD of all the array elements.
public class GCD_ofArrayElements {

    public static int gcd(int n, int []arr) {
        // code here.
        int gcd=arr[0];
        for(int i=0;i<n-1;i++){
            gcd=gcd(gcd,arr[i+1]);
        }
        return gcd;
    }
    static int gcd(int a,int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int []arr = {2, 4, 6, 8};
        int n = 4;
        System.out.println(gcd(n,arr));   // 2
    }
}
