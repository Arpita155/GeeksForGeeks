package GeeksForGeeks.Arrays.Easy;

//Q . Given an array height representing the heights of buildings. You have to count the buildings that will see the sunrise (Assume the sun rises on the side of the array starting point).
//Note: The height of the building should be strictly greater than the height of the buildings left in order to see the sun.

public class FacingTheSun {

    public static int countBuildings(int[] height) {
        // code here
        int count = 1;
        int max = height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>max){
                max = height[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[]height = {7, 4, 8, 2, 9};

        System.out.println(countBuildings(height));    // 3
    }
}
