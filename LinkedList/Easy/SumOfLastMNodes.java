package GeeksForGeeks.LinkedList.Easy;

public class SumOfLastMNodes {

    public static int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        curr = head;
        int c=1;
        int sum =0;
        while(curr != null){
            if(count-c < n){
                sum += curr.data;
            }
            c++;
            curr = curr.next;
        }

        return sum;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Sum of last m node = "+sumOfLastN_Nodes(head,2));
    }
}
