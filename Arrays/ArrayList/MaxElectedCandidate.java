package GeeksForGeeks.Arrays.ArrayList;

import java.util.HashMap;

public class MaxElectedCandidate {

    public static String electionWinner(String arr[]) {
        // Your code here
        HashMap<String,Integer> hm = new HashMap<>();
        for(String s : arr){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        int max = 0;
        String maxvottedCandidate = "";
        for(String key : hm.keySet()){
            if(hm.get(key) > max){
                max = hm.get(key);
                maxvottedCandidate = key;
            }
        }

        return maxvottedCandidate;
    }

    public static void main(String[] args) {
        String[]arr = {"Shrikant", "Sushma", "Rajnath", "Sushma"};
        System.out.println("Max voted student is : "+electionWinner(arr));
    }
}
