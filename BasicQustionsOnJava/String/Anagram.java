package GeeksForGeeks.BasicQustionsOnJava.String;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter second string:");
        String  s2 = sc.nextLine();
        System.out.println(areAnagrams(s1,s2));
    }
}
