package GeeksForGeeks.Tree.Medium;

import java.util.LinkedList;
import java.util.Queue;

class Nodee {
    int data;
    Nodee next;
    Nodee left, right;

    Nodee(int x) {
        data = x;
        left = right = next = null;
    }

    static void traversal(Nodee head) {
        // --------Recursive Traversal------------
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);
    }
}
public class LinkedListToBinaryTreeUsingQueue {

    public static Nodee linkedListToBinaryTree(Nodee head) {
        // code here
        if(head == null){
            return null;
        }

        Queue<Nodee> q = new LinkedList<>();
        Nodee root = new Nodee(head.data);
        q.add(root);
        head = head.next;

        while(head != null){
            Nodee curr = q.poll();

            curr.left = new Nodee(head.data);
            q.add(curr.left);
            head = head.next;

            if(head==null) break;

            curr.right = new Nodee(head.data);
            q.add(curr.right);
            head = head.next;
        }

        return root;
    }

    public static void main(String[] args) {

        Nodee head = new Nodee(10);
        head.next=new Nodee(20);
        head.next.next=new Nodee(30);
        head.next.next.next=new Nodee(40);
        head.next.next.next.next=new Nodee(50);

    }
}
