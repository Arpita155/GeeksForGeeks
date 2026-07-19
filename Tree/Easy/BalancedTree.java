package GeeksForGeeks.Tree.Easy;

public class BalancedTree {

    public static boolean isBalanced(Node root) {
        // code here
        return height(root) != -1;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        if(left == -1){
            return -1;
        }
        int right = height(root.right);
        if(right == -1){
            return -1;
        }

        if(Math.abs(left-right) > 1){
            return -1;
        }

        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        System.out.println("Is it a balanced tree ? : "+isBalanced(root));   // true
    }
}
