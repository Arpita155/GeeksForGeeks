package GeeksForGeeks.String.Basics;

//Q. Given a string S. Count the characters that have ‘N’ number of occurrences.
// If a character appears consecutively it is counted as 1 occurrence.
public class CountTheCharacter {

    public static int getCount(String s, int N) {
        // your code here
        int [] arr = new int [256];
        for(int i = 0;i<s.length();){
            int j = i+1;
            while(j<s.length() && s.charAt(i)==s.charAt(j))
                j++;
            arr[s.charAt(i)]++;
            i=j;
        }

        int ans = 0;
        for(int a : arr)
        {
            if(a==N)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {

        String S = "abc";
        int N = 1;

        System.out.println("No of character equals to N is : "+getCount(S,N));  // output : No of character equals to N is : 3
    }
}
