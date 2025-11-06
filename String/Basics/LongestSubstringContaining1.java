package GeeksForGeeks.String.Basics;

public class LongestSubstringContaining1 {

    public static int count(String s) {
        // add code here.
        int count = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='1'){
                count++;
            }else{
                if(max < count){
                    max = count;
                }
                count = 0;
            }
        }
        if(max < count){
            return count;
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "11101110";
        System.out.println(count(str));    // 3
    }
}
