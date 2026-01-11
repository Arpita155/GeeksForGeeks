package GeeksForGeeks.Arrays.Medium;

import java.util.LinkedHashMap;

public class UniqueNumber {

    public static int getSingle(int[] nums) {
        // code here
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        int single = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                single = key;
            }
        }
        return single;
    }

    public static void main(String[] args) {
        int[]arr = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1};
        System.out.println(getSingle(arr));      // 3
    }
}
