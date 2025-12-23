package GeeksForGeeks.LinkedList.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class SortSLL {

    public static Node insertionSort(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        ArrayList<Integer> al = new ArrayList<>();
        Node curr = head;
        while(curr!=null){
            al.add(curr.data);
            curr=curr.next;
        }
        Collections.sort(al);

        curr = head;
        int i=0;
        while(curr!=null){
            curr.data=al.get(i);
            i++;
            curr=curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(2);
        head.next.next = new Node(13);
        head.next.next.next = new Node(11);

        System.out.print("Before sorting : ");
        Node.traversal(head);

        head=insertionSort(head);

        System.out.print("\nAfter sorting : ");
        Node.traversal(head);
    }
}
