package GeeksForGeeks.String.Medium;

public class SubStringWithMultiple0s1sDifference {

    public static int maxSubstring(String s) {
        // code here
        int n=s.length();
        int maxSum = -1;
        int currSum = 0;

        for(int i = 0; i < n; i++) {
            int val = (s.charAt(i) == '0') ? 1 : -1;
            currSum += val;
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0) currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        String s = "11000010001";
        System.out.println("Maximum difference is : "+maxSubstring(s));
    }
}
