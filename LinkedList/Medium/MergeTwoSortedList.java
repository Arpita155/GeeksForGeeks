package GeeksForGeeks.LinkedList.Medium;

public class MergeTwoSortedList {

    public static Node sortedMerge(Node head1, Node head2) {
        // code here
        Node head = null;
        Node curr1 = head1;
        Node curr2 = head2;
        if(head1.data <= head2.data){
            head = head1;
            curr1=curr1.next;
        }
        else{
            head = head2;
            curr2=curr2.next;
        }
        Node curr = head;
        while(curr1!=null && curr2!=null){
            if(curr1.data <= curr2.data){
                curr.next = curr1;
                curr1 = curr1.next;
                curr = curr.next;
            }else{
                curr.next = curr2;
                curr2 = curr2.next;
                curr = curr.next;
            }
        }

        while(curr1 != null){
            curr.next = curr1;
            curr1 = curr1.next;
            curr = curr.next;
        }
        while(curr2 != null){
            curr.next = curr2;
            curr2 = curr2.next;
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(1);
        head2.next = new Node(5);
        head2.next.next = new Node(35);
        head2.next.next.next = new Node(55);

        System.out.print("LL1 looks like this : ");
        Node.traversal(head1);
        System.out.print("\nLL2 looks like this : ");
        Node.traversal(head2);

        Node head =  null;
        head = sortedMerge(head1,head2);

        System.out.println("\nAfter merging : ");
        Node.traversal(head);
    }
}
