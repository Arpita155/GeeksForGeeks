package GeeksForGeeks.LinkedList.DoublyLinkedList.Easy;

import GeeksForGeeks.LinkedList.DoublyLinkedList.Node;

public class ConvertArrayToDLL {

    public static Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        Node curr=head;
        Node prev=null;
        int i=1;
        while(i<arr.length){
            Node t1 = new Node(arr[i]);
            curr.next=t1;
            t1.prev=curr;
            curr=curr.next;
            i++;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node.traversal(head);
    }
}
