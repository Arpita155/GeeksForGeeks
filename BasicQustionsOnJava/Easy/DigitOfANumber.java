package GeeksForGeeks.BasicQustionsOnJava.Easy;

public class DigitOfANumber {

    public static int countDigits(int n) {
        // Code here
        int count = 0;
        while(n != 0){
            count++;
            n/=10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigits(n));
    }
}
