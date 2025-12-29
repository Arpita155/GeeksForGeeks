package GeeksForGeeks.LinkedList.Medium;

public class FindFirstNodeOfLL {

    public static int firstNode(Node head){
        Node slow = head ;
        Node fast = head ;
        Node b = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                while(b!=slow){
                    b=b.next;
                    slow=slow.next;
                }
                return slow.data;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next=head;

        System.out.println("Fast node is : "+firstNode(head));
    }
}
