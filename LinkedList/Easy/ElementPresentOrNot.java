package GeeksForGeeks.LinkedList.Easy;

public class ElementPresentOrNot {

    public static boolean searchKey(Node head, int key) {
        // Code here
        Node curr = head;
        while(curr!=null){
            if(curr.data == key){
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("LL looks like this : ");
        Node.traversal(head);

        System.out.print("\nIs the element present in the list : ");
        System.out.println(searchKey(head,60));
    }
}
