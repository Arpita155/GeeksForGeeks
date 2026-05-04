package GeeksForGeeks.Stack.Medium;

import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    Node right;
    Node left;
    Node next;

    Node(int value){
        this.data=value;
        this.right=null;
        this.left=null;
        this.next=null;
    }
}

public class PreOrderTraversal {

    public static ArrayList<Integer> preOrder(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null){
            return al;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            al.add(curr.data);
            if(curr.right!=null){
                st.push(curr.right);
            }
            if(curr.left!=null){
                st.push(curr.left);
            }
        }

        return al;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left=new Node(2);
        head.right=new Node(3);
        head.left.left=new Node(4);
        head.left.right=new Node(5);

        System.out.println(preOrder(head));
    }
}
