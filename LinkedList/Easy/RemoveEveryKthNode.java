package GeeksForGeeks.LinkedList.Easy;

import javax.sound.midi.Soundbank;

public class RemoveEveryKthNode {

    public static Node deleteK(Node head, int k) {
        // Your code here
        Node curr = head;
        Node prev = curr;
        int count = 0;
        while(curr != null){
            count++;
            if(count%k==0){
                prev.next=curr.next;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(2);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int k = 2;
        System.out.print("Before Removal LL looks like this : ");
        Node.traversal(head);

        deleteK(head,k);
        System.out.print("\nAfter Removal LL looks like this : ");
        Node.traversal(head);
    }
}
