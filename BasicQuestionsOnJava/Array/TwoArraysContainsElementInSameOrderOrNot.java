package GeeksForGeeks.BasicQustionsOnJava.Array;

public class TwoArraysContainsElementInSameOrderOrNot {

    //Q. Given a two integer arrays a[] and b[], you need to find if both the arrays contain the same elements in the same order or not.

    public static boolean areEqual(int a[], int b[]) {
        // Your code here
        int flag = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {4, 3, 2, 1};
        boolean result = areEqual(a,b);
        System.out.println("Is the order of the element of two given arrays are same: "+result);
    }
}
