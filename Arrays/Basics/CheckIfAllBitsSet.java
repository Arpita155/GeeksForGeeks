package GeeksForGeeks.Arrays.Basics;

public class CheckIfAllBitsSet {

    public static boolean isBitSet(int n) {
        // code here
        if(n==0){
            return false;
        }
        while(n>0){
            if(n%2==0){
                return false;
            }
            n /= 2;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("Is there all bits 1 : "+isBitSet(n));
    }
}
