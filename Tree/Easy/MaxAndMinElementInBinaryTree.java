package GeeksForGeeks.Tree.Easy;

public class MaxAndMinElementInBinaryTree {

    public static int findMax(Node root) {
        // code here
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int l = findMax(root.left);
        int r = findMax(root.right);

        int max = Math.max(l,r);
        return Math.max(max,root.data);
    }

    public static int findMin(Node root) {

        // code here
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int l = findMin(root.left);
        int r = findMin(root.right);

        int min = Math.min(l,r);
        return Math.min(min,root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        System.out.println("Minimum Element is : "+findMax(root));
        System.out.println("Minimum Element is : "+findMin(root));
    }
}
