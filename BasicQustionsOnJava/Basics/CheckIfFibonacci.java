package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class CheckIfFibonacci {

    public static String checkFibonacci(int N) {
        // code here
        if(N<=0){
            return " NO";
        }
        int a=0,b=1;
        while(b<N){
            int c=a+b;
            a=b;
            b=c;
        }
        if(b==N){
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
    public static void main(String[] args) {
        int n = 34;
        System.out.println(checkFibonacci(n));
    }
}
