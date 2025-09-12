package GeeksForGeeks.String;

public class FirstRepeatedCharacter {
    public static char firstRep(String S) {
        // your code here
        for(int i=0;i<S.length()-1;i++){
            for(int j=i+1;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j))
                {
                    return S.charAt(i);
                }
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        String S = "geeksforgeeks";
        System.out.println("First repeated character is : "+firstRep(S));
    }
}
