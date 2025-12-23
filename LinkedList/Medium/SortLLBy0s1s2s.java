package GeeksForGeeks.LinkedList.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortLLBy0s1s2s {

    public static Node sort(Node head) {

        HashSet<Integer> hs = new HashSet<>();
        Node curr = head;
        while(curr != null){
            if(!hs.contains(curr.data)){
                hs.add(curr.data);
                curr=curr.next;
            }else {
                curr = curr.next;
            }
        }
        curr=head;
        for(int i : hs){
            curr.data = i;
            curr = curr.next;
        }
        return head;

        // Naive Approach    : T.C = O(n*log(n)) S.C = O(n)
//        ArrayList<Integer> al = new ArrayList<>();
//        Node curr = head;
//        while(curr != null){
//            al.add(curr.data);
//            curr = curr.next;
//        }
//        Collections.sort(al);
//        curr = head;
//        for(int i=0;i<al.size();i++){
//            curr.data=al.get(i);
//            curr=curr.next;
//        }
//
//        return head;

        // Efficient Approach   : T.C = O(n) S.C= O(1)
        /*int zero = 0;
        int one = 0;
        int two = 0;
        Node curr = head;
        while(curr != null){
            if(curr.data == 0){
                zero++;
            }else if(curr.data == 1){
                one++;
            }else{
                two++;
            }
            curr = curr.next;
        }
        curr = head;
        while(zero>0){
            curr.data=0;
            curr=curr.next;
            zero--;
        }
        while(one>0){
            curr.data=1;
            curr=curr.next;
            one--;
        }
        while(two>0){
            curr.data=2;
            curr=curr.next;
            two--;
        }

        return head;
        */

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);

        System.out.print("Before sorting : ");
        Node.traversal(head);

        head=sort(head);

        System.out.print("\nAfter sorting : ");
        Node.traversal(head);
    }
}
