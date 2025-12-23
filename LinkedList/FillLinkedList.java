package GeeksForGeeks.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.lang.Integer;
public class FillLinkedList {
    public static void fillLinkedList(LinkedList<Integer> ll, int k) {
        // Your code here
        int s = ll.size();
        ll.clear();
        for(int i=0;i<s;i++){
            ll.add(k);
            System.out.print(ll.poll()+" ");
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int x = 67;
        fillLinkedList(l,x);
    }
}
