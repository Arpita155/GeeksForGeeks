package GeeksForGeeks.LinkedList.Basic;

public class FindLengthOfLinkedList {

    public static int getCount(Node head) {
        // code here
        int count = 1;

        if(head == null){
            return 0;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        return count;
    }

    public  static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Length of linked List is : "+getCount(head));
    }
}
