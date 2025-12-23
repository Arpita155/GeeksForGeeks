package GeeksForGeeks.LinkedList.Easy;

public class DeleteMiddleOfLinkedList {

    public static Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.

        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        Node curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }

        curr = head;

        for(int i=1;i<count/2;i++){
            curr=curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("LL looks like this : ");
        Node.traversal(head);

        head = deleteMid(head);

        System.out.println("\nAfter deletion LL looks like this : ");
        Node.traversal(head);
    }

}
