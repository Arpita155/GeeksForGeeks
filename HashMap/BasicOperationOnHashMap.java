package GeeksForGeeks.HashMap;

import java.util.HashMap;

public class BasicOperationOnHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String > map = new HashMap<>();

        // ------Add key-value------
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");


        // -----Remove key------
        /*System.out.println(map.remove(1));   //ans.--> One
        System.out.println(map.remove("Two"));   //ans.--> null
        */

        // ------Get value------
        System.out.println(map.get(2));   // ans.--> Two

        // Get All Values
        System.out.println(map.values());  // ans.--> [One, Two, Three]

        // ------Get All Keys-------
        System.out.println(map.keySet());   // ans.--> [1, 2, 3]

        // -----------Check key---------
        System.out.println(map.containsKey(2)); // ans.--> true

        // ---------Check values---------
        System.out.println(map.containsValue("Two"));  // ans.--> true
        System.out.println("two");   // ans.--> false

        // -------Get all Keys-value using loop---------
        for(Integer key : map.keySet()){
            System.out.println(key +" =>"+map.get(key));   // ans.-->1 => one 2 => two 3 => three
        }

        // -----Get size------
        System.out.println(map.size());  // ans.--> 3

        // --------Clone of map---------
        System.out.println(map.clone());   //ans.--> {1=One, 2=Two, 3=Three}

        // -------Clear map ---------
        System.out.println(map.isEmpty());  //ans.--> false
        map.clear();   // it clears the HashMap

        // ---------Check Empty--------
        System.out.println(map.isEmpty()); //ans.--> true


    }
}
