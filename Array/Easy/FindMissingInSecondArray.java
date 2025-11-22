package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class FindMissingInSecondArray {

    public static ArrayList<Integer> findMissing(int[] a, int[] b)
    {
        ArrayList<Integer> list = new ArrayList<>();


        HashSet<Integer> set = new HashSet<>();
        for (int num : b) {
            set.add(num);
        }


        for (int num : a) {
            if (!set.contains(num)) {
                list.add(num);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 10};
        int[] b = {2, 3, 1, 0, 5};

        System.out.println(findMissing(a,b));   //Output : [4,10]
    }
}
