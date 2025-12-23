package GeeksForGeeks.BasicQustionsOnJava.Easy;

public class SumOfDivisors {

    public static int sumOfDivisors(int n) {
        // code here
        int[]sieve=new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                if(j%i==0){
                    sieve[j]+=i;
                }
            }
        }
        //   System.out.println(Arrays.toString(sieve));
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) sum+=sieve[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int n = 54;
        System.out.println(sumOfDivisors(n));   //Output : 232
    }
}
