package GeeksForGeeks.LinkedList.Basic;

class Node {
    int data;
    Node next;
    Node(int a)
    {   data = a;
        next = null;
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
