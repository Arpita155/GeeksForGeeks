package GeeksForGeeks.LinkedList.DoublyLinkedList.Easy;

import GeeksForGeeks.LinkedList.DoublyLinkedList.Node;

public class DeleteKthNodeInDLL {
    public static Node delPos(Node head, int x) {
        // code here
        if(head==null || x<0){
            return null;
        }

        if(x==1){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return head;
        }else{
            Node temp=head;
//        int c=1;

            for (int i = 1; temp != null && i < x; i++) {
                temp = temp.next;
            }
            // if position is invalid (greater than list length)
            if(temp==null)return head;

            // unlink temp from DLL
            if(temp.prev!=null)
                temp.prev.next=temp.next;
            if(temp.next!=null)
                temp.next.prev=temp.prev;
            temp.next=null;
            temp.prev=null;
        }

        return head;

    }

    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Before deletion : ");
        Node.traversal(head);

        head=delPos(head,3);

        System.out.print("\nAfter deletion : ");
        Node.traversal(head);
    }
}
