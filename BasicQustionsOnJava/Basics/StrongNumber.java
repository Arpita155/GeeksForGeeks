package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class StrongNumber {

    public static boolean isStrong(int N) {
        // code here
        int temp = N;
        int sum = 0;
        while(N!=0){
            int rem = N%10;
            sum += fact(rem);
            N/=10;
        }

        if(sum== temp){
            return true;
        }
        return false;
    }

    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 145;
        System.out.println("Is the number strong number : "+isStrong(n));
    }
}
