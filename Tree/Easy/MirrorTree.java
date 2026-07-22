package GeeksForGeeks.Tree.Easy;

public class MirrorTree {

    public static void mirror(Node root) {
        // code here
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Node t = root.left;
        root.left=root.right;
        root.right=t;

        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        mirror(root);

    }
}
