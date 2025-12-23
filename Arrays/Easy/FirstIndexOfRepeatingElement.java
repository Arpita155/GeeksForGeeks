package GeeksForGeeks.Arrays.Easy;

public class FirstIndexOfRepeatingElement {

    public static int firstRepeated(int[] arr) {
        // code here
        int result = 0;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    result = i+1;
                    flag = true;
                    return result;
                }
            }
            if(flag == true){
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr));    // 2
    }
}
