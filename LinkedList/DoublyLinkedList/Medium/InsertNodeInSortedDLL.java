package GeeksForGeeks.LinkedList.DoublyLinkedList.Medium;

import GeeksForGeeks.LinkedList.DoublyLinkedList.Node;

public class InsertNodeInSortedDLL {

    public static Node sortedInsert(Node head, int x) {
        // add your code here

        Node temp = new Node(x);
        if(x<=head.data){
            temp.next=head;
            head.prev=temp;
            head=temp;
            return head;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data<x){
            curr=curr.next;
        }
        temp.next=curr.next;
        temp.prev=curr;

        if(curr.next!=null){
            curr.next.prev=temp;
        }

        curr.next=temp;
        return head;
    }

    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Before inserting : ");
        Node.traversal(head);

        head=sortedInsert(head,25);

        System.out.print("\nafter inserting : ");
        Node.traversal(head);
    }
}
