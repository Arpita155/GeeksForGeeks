package GeeksForGeeks.LinkedList.Medium;

public class ReArrangeLL {

    public static void rearrangeEvenOdd(Node head) {
        //  The task is to complete this method
        if(head==null || head.next==null){
            return;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Before Rearranging : ");
        Node.traversal(head);

        rearrangeEvenOdd(head);

        System.out.print("\nAfter Rearranging : ");
        Node.traversal(head);

    }
}
