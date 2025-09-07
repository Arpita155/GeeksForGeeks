package GeeksForGeeks.Arrays;

public class FirstOccurrenceOfAnElementInAnArray {

    public static int search(int []arr, int x) {
        // code here
        int index = 0;
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag =1;
                index = i;
                break;
            }
        }
        if(flag == 1){
            return index;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4};
        int x = 3;
        System.out.println("The index of First Occurrence of the given element in the array is : "+search(arr,x));
    }
}
