package GeeksForGeeks.BasicQustionsOnJava.Basics;

// Q. Given a string S, remove all consonants and print the modified string that contains vowels only.
public class RemoveConsonantsFromAString {

    public static String removeConsonants(String s) {
        // code here.


        StringBuilder sb = new StringBuilder();
        //s=s.toLowerCase();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                sb.append(ch);
            }
        }

        return sb.isEmpty() ? "No Vowel":sb.toString();
    }

    public static void main(String[] args) {

        String s = "abEkipo";
        System.out.println(removeConsonants(s));   // Output : aEio
    }
}
