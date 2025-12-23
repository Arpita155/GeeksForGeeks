package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class QueueTraversal {
    public static void queueTraversal(int[] q) {
        // Your code here
        for(int i:q){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int []q = {3 ,4, 2, 2, 4};
        queueTraversal(q);
    }
}
