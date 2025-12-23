package GeeksForGeeks.LinkedList.Medium;

public class RotateLinkedList {

    public static Node rotate(Node head, int k) {
        // code here

        if(head == null || head.next == null || k==0){
            return head;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        Node temp = head;
        while(k>0){
            curr.next = head;
            curr = curr.next;
            temp = head.next;
            head.next = null;
            head = temp;
            k--;
        }
        return temp;

    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Before Rotation : ");
        Node.traversal(head);

        head=rotate(head,1);

        System.out.print("\nAfter rotation : ");
        Node.traversal(head);
    }
}
