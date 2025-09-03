package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class APTerm {
    public int nthTerm(int a, int d, int n) {
        // code here
        int an = a+((n-1)*d);
        return an;
    }

    public static void main(String[] args) {
        APTerm obj = new APTerm();
        int result = obj.nthTerm(5,2,5);
        System.out.println(result);    // Output : 13
    }
}
