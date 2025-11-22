package GeeksForGeeks.Arrays.Easy;

//Q. Your friend loves magic and he has coined a new term - "Magical number". To perform his magic, he needs that magic number.
// You are given a sorted array arr of distinct integers. A number arr[i] is a magical number if arr[i] = i (0-based indexing). Else return -1.
public class MagicalNumber {

    public static int findMagicalNumber(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {-2, -1, 2, 4, 6};

        System.out.println(findMagicalNumber(arr));   // 2
    }
}
