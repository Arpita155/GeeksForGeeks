package GeeksForGeeks.Arrays;

public class Replace0sWith5 {
    public static int convertfive(int num) {
        // Your code here
        int sum =0;
        int place = 1;
        if(num==0){
            return 5;
        }
        while(num > 0){
            int rem = num%10;
            if(rem == 0){
                rem = 5;
            }

            sum = rem * place + sum;
            place = place * 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1004;
        System.out.println("After replacement the output is : "+convertfive(n));
    }
}
