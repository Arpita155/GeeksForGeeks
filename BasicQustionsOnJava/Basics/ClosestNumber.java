package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class ClosestNumber {

    static int closestNumber(int n, int m) {
        // code here
        int q = Math.floorDiv(n, m);

        int n1 = m * q;

        int n2 = m * (q + 1) ;

        if (Math.abs(n - n1) < Math.abs(n - n2)){
            return n1;
        } else if (Math.abs(n - n2) < Math.abs(n - n1)){
            return n2;
        }
        else{
            return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println(closestNumber(n,m));
    }
}
