package GeeksForGeeks.LinkedList.Medium;

public class Practice {

    public static void reorderList(Node head) {
        if(head==null || head.next==null){
            return;
        }

        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev =  reverse(slow.next);
        slow.next = null;

        Node temp = head;
        while(rev != null){

            Node tcurr = temp.next;
            Node rcurr = rev.next;

            temp.next=rev;
            rev.next=tcurr;

            temp=tcurr;
            rev=rcurr;
        }

    }

    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);


        System.out.print("Before Rearranging : ");   // Before Rearranging : 10 20 30 40
        Node.traversal(head);

        reorderList(head);

        System.out.print("After Rearranging : ");
        Node.traversal(head);
    }
}
