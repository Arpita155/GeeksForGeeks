package GeeksForGeeks.LinkedList.DoublyLinkedList.Easy;

import GeeksForGeeks.LinkedList.DoublyLinkedList.Node;

public class RotateDLL {

    public static Node rotateDLL(Node head, int p) {
        // code here..

        if(head==null || head.next==null){
            return head;
        }

        int length=0;
        Node curr = head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        p=p%length;
        if(p==0){
            return head;
        }

        Node tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }

        tail.next=head;
        head.prev=tail;

        for(int i=1;i<=p;i++){
            head=head.next;
            tail=tail.next;
        }
        head.prev=null;
        tail.next=null;

        return head;
    }

    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Original DLL : ");
        Node.traversal(head);

        head=rotateDLL(head,2);

        System.out.print("\nAfter rotation : ");
        Node.traversal(head);
    }
}
