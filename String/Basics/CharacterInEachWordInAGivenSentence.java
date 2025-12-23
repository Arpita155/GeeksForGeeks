package GeeksForGeeks.String.Basics;

import java.util.ArrayList;

//Q. Given a string containing multiple words, count the characters in each word and display them.
public class CharacterInEachWordInAGivenSentence {

    public static ArrayList<Integer> countChars(String s) {
        // code here
        ArrayList<Integer> ln = new ArrayList<>();
        String [] arr = s.split("\\s+");
        for(String word : arr){
            ln.add(word.length());
        }

        return ln;
    }

    public static void main(String[] args) {

        String s = "the quick brown fox";
        System.out.println(countChars(s));   // Output : [3, 5, 5, 3]
    }
}
