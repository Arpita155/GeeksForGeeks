package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class GP_Term {
    public static long sum_of_gp(long n, long a, long r) {
        // Code here
        long sum = 0;
        for(int i = 0; i <n ; i++){
            sum = sum +a;
            a = a*r;
        }
        return sum;
    }

    public static void main(String[] args) {
        long n = 3,a=3,r=2;
        System.out.println(sum_of_gp(n,a,r));   // 21
    }
}
