package GeeksForGeeks.Tree.Medium;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node next;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = next = null;
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
public class LinkedListToBinaryTreeUsingQueue {

    public static Node linkedListToBinaryTree(Node head) {
        // code here
        if(head == null){
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(head.data);
        q.add(root);
        head = head.next;

        while(head != null){
            Node curr = q.poll();

            curr.left = new Node(head.data);
            q.add(curr.left);
            head = head.next;

            if(head==null) break;

            curr.right = new Node(head.data);
            q.add(curr.right);
            head = head.next;
        }

        return root;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

    }
}
