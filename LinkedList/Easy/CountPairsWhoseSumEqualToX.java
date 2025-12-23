package GeeksForGeeks.LinkedList.Easy;

import java.util.HashSet;

public class CountPairsWhoseSumEqualToX {

    public static int countPairs(Node head1, Node head2, int x) {
        // add your code here
        HashSet<Integer> hs1= new HashSet<Integer>();
        int count=0;
        while(head2!=null)
        {
            hs1.add(head2.data);
            head2=head2.next;
        }
        while(head1!=null)
        {
            if(hs1.contains(x-head1.data))
            {
                count++;
            }
            head1=head1.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(11);
        head2.next = new Node(12);
        head2.next.next = new Node(13);

        System.out.print("LL1 looks like this : ");
        Node.traversal(head1);
        System.out.print("\nLL2 looks like this : ");
        Node.traversal(head2);

        System.out.println("Total number of pairs = "+countPairs(head1,head2,15));
    }
}
