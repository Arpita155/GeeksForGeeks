package GeeksForGeeks.LinkedList.Medium;

public class FindLengthOfLoop {

    public static int lengthOfLoop(Node head) {
        // code here
        if(head == null || head.next == null){
            return 0;
        }
        int count = 0;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow == fast){
                count = 1;
                slow=slow.next;
                while(fast!=slow){
                    slow=slow.next;
                    count++;
                }
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next=head.next;

        System.out.println("Length of loop is : "+lengthOfLoop(head));
    }
}
