package GeeksForGeeks.LinkedList.Easy;

import java.util.HashSet;

public class RemoveDuplicateFromUnsortedLL {

    public static Node removeDuplicates(Node head) {
        // Your code here
        if(head == null){
            return null;
        }
        HashSet<Integer> set=new HashSet<>();
        Node curr=head;
        set.add(curr.data);
        while(curr.next!=null){
            int x=curr.next.data;
            if(set.contains(x)){
                curr.next=curr.next.next;
            }else{
                set.add(x);
                curr=curr.next;
            }
        }
        return head;
    }

    public  static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(2);
        head.next.next = new Node(10);
        head.next.next.next = new Node(40);

        System.out.print("Before removing duplicates : ");
        Node.traversal(head);

        head=removeDuplicates(head);
        System.out.print("\nAfter removing duplicates : ");
        Node.traversal(head);
    }
}
