package GeeksForGeeks.LinkedList.Basic;

public class InsertInMiddleOfALinkedList {

    public static Node insertInMiddle(Node head, int x) {
        // Code here
        if(head==null){
            return new Node(x);
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node newnode=new Node(x);
        newnode.next=slow.next;
        slow.next=newnode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);

        System.out.print("Before inserting : ");
        Node.traversal(head);

        head=insertInMiddle(head,25);

        System.out.print("\nAfter inserting : ");
        Node.traversal(head);
    }
}
