package GeeksForGeeks.LinkedList.Easy;

public class NodeAtAGivenIndex {

    public static int getNth(Node head, int index) {
        // Code here
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            if(count == index){
                return curr.data;
            }
            curr = curr.next;
        }

        return -1;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("LL looks like this : ");
        Node.traversal(head);

        System.out.print("\nElement of the given index : ");
        System.out.println(getNth(head,3));
    }
}
