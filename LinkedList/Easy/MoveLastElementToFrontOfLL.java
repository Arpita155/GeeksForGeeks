package GeeksForGeeks.LinkedList.Easy;

import javax.sound.midi.Soundbank;

public class MoveLastElementToFrontOfLL {

    public static Node moveToFront(Node head) {
        // code here
        Node curr=head;
        Node prev = curr;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        curr.next=head;
        prev.next=null;
        head=curr;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Before moving last element : ");
        Node.traversal(head);

        head=moveToFront(head);

        System.out.print("\nAfter moving last element : ");
        Node.traversal(head);
    }
}
