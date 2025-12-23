package GeeksForGeeks.HashMap;
import java.util.HashMap;
public class ExampleOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Value for key 2: " + map.get(2));  // Banana

        for (Integer key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
