package GeeksForGeeks.Arrays.Easy;
//Q. Given an array arr[]. Your task is to return an integer denoting the total number of times digit k appears in the array.
public class CountOccurrenceOfDigitK {
    public static int num(int k, int []arr) {
        // code here
        int count = 0;
        int s = arr.length;
        for(int i=0;i<s;i++){
            int a = arr[i];
            while(a != 0){
                int b = a%10;
                if(b == k){
                    count++;
                }
                a = a/10;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int k=1;
        int[] arr = {11, 12, 13, 14, 15};

        System.out.println(num(k,arr));    // 6

    }
}
