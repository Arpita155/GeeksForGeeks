package GeeksForGeeks.LinkedList.Easy;

public class CheckCircularLLOrNot {

    static boolean isCircular(Node head) {
        // Your code here
        Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=head;

        System.out.println("Is it a circularLinkedList : "+isCircular(head));     //true
    }
}
