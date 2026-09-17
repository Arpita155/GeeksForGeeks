package GeeksForGeeks.Tree.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CornerNodesInBinaryTree {

    public static List<Integer> getCorner(Node root) {
        // code here
        List<Integer> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            Node first = null;
            Node last = null;

            for(int i=0;i<size;i++){
                Node temp = q.poll();

                if(i == 0){
                    first = temp;
                }
                if(i == size-1){
                    last = temp;
                }

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }

            res.add(first.data);
            if(last != first){
                res.add(last.data);
            }

        }

        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println(getCorner(root));    // [10, 20, 30, 40, 70]
    }
}
