package GeeksForGeeks.LinkedList.Medium;

public class DetectLoopInLL {

    public static boolean detectLoop(Node head) {
        // code here
        Node temp = new Node(121);
        Node curr = head;
        Node ncurr= head;
        while(curr!=null){
            if(curr.next==temp){
                return true;
            }
            ncurr = curr.next;
            curr.next=temp;
            curr=ncurr;
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next=head;

        System.out.println("Is there any loop in LL : "+detectLoop(head));
    }
}
