package GeeksForGeeks.String.Medium;

import java.math.BigInteger;

class MultiplyTwoString {

    public static String multiplyStrings(String s1, String s2) {
        // code here
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);

        // Multiply
        BigInteger ans = n1.multiply(n2);

        // Convert back to String
        return ans.toString();
    }

    public static void main(String[] args) {
        String str1 = "0033";
        String str2 = "2";
        System.out.println(multiplyStrings(str1,str2));
    }
}
