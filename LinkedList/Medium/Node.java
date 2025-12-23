package GeeksForGeeks.LinkedList.Medium;

public class Node {
    int data;
    Node next;

    Node(int value){
        this.data=value;
        this.next=null;
    }

    static void traversal(Node head) {
        // --------Recursive Traversal------------
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);
    }
}
