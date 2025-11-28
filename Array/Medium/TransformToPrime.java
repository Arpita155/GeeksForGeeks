package GeeksForGeeks.Arrays.Medium;

public class TransformToPrime {

    public static int minNumber(int arr[], int N) {
        int sum = 0;
        for(Integer n: arr){
            sum+=n;
        }
        if(isPrime(sum)) return 0;
        int temp = sum + 1;
        while(true){
            if(isPrime(temp)){
                return temp - sum;
            }
            temp++;
        }


    }
    private static boolean isPrime(int num){
        if(num==0||num==1) return false;
        for(int i=2; i*i<=num; i++){
            if(num%i==0)return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int N=5;
        int[] arr = {2, 4, 6, 8, 12};
        System.out.println(minNumber(arr,N));   // Output : 5
    }
}
