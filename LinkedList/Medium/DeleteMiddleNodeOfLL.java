package GeeksForGeeks.LinkedList.Medium;

public class DeleteMiddleNodeOfLL {

    public static Node deleteMiddle(Node head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            head=null;
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node prev=null;
        while (fast!=null && fast.next!=null){
            prev=slow;
            slow= slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Before deletion : ");
        Node.traversal(head);

        head=deleteMiddle(head);

        System.out.print("\nAfter deletion : ");
        Node.traversal(head);
    }
}
