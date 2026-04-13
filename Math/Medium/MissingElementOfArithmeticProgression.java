package GeeksForGeeks.Math.Medium;

public class MissingElementOfArithmeticProgression {

    public static int findMissing(int[] arr) {
        // code here
        int n = arr.length;
        if(n==2){
            return arr[1]+(arr[1]-arr[0]);
        }
        int diff = 0;
        int d1 = arr[1]-arr[0];
        int d2 = arr[2]-arr[1];
        diff = Math.abs(d1) < Math.abs(d2)?d1:d2;

        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]+diff){
                return arr[i-1]+diff;
            }
        }

        return arr[n-1]+diff;
    }

    public static void main(String[] args) {
        int[]arr = {2, 4, 8, 10, 12, 14};
        System.out.println("Missing element is : "+findMissing(arr));
    }
}
