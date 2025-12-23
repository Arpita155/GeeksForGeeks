package GeeksForGeeks.Arrays.Basics;

public class CountPairSum {

    // Q. Given two sorted arrays arr1 and arr2 of distinct elements. Given a value x. The problem is to count all pairs from both arrays whose sum equals x.
    //Note: The pair has an element from each array.
    static int countPairs(int arr1[], int arr2[], int x) {
        // code here.
        int count =0;
        for(int i=0;i<arr1.length;i++){
            for(int j =0;j<arr2.length;j++){
                if(arr1[i]+arr2[j]==x){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 10;
        int []arr1 = {1, 3, 5, 7};
        int []arr2 = {2, 3, 5, 8};
        System.out.println(countPairs(arr1,arr2,x));   //output : 2   Explanation : The pairs are: (5, 5) and (7, 3).
    }
}
