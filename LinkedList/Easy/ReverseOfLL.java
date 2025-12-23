package GeeksForGeeks.LinkedList.Easy;

public class ReverseOfLL {

    static Node reverseList(Node head) {
        // code here      T.C = O(n)  S.C= O(1)
        if(head==null || head.next==null){
            return head;
        }

        Node prev = null;
        Node next = null;
        Node curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        System.out.print("Before reversal : ");
        Node.traversal(head);

        head=reverseList(head);

        System.out.print("\nAfter traversal : ");
        Node.traversal(head);
    }
}
