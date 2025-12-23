package GeeksForGeeks.LinkedList.Medium;

public class SwapKthNodeFromEnd {

    public static Node swapKth(Node head, int k) {
        // code here
        Node curr = head;
        Node curr1 = head;
        Node curr2=head;
        int c = 0;
        while(curr != null){
            c++;
            curr=curr.next;
        }
        curr=head;
        int c1 = 0;
        while(curr != null){
            c1++;
            if(k==c1){
                curr1 = curr;
                break;
            }
            curr = curr.next;
        }
        curr=head;
        int c2 = 0;
        while(curr != null){
            c2++;
            if(c2==c+1-k){
                curr2 = curr;
                break;
            }
            curr = curr.next;
        }
        int t=curr1.data;
        curr1.data=curr2.data;
        curr2.data=t;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Before Swapping : ");
        Node.traversal(head);

        head = swapKth(head,1);

        System.out.print("\nAfter Swapping : ");
        Node.traversal(head);
    }
}
