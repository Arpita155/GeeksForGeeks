package GeeksForGeeks.Arrays.Medium;

public class NumberOfPair {

    public static long countPairs(int[] arr1, int[] arr2) {
        // code here
        long count = 0l;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(Math.pow(arr1[i],arr2[j]) > Math.pow(arr2[j],arr1[i])){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6};
        int[] arr2 = {1, 5};
        System.out.println("Number of pair possible : "+countPairs(arr1,arr2));
    }
}
