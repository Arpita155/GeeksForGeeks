package GeeksForGeeks.LinkedList.Easy;

public class FrequencyInLL {

    public static int count(Node head, int key) {
        // code here
        Node curr = head;
        int count = 0;
        while(curr != null){
            if(curr.data == key){
                count++;
            }
            curr = curr.next;
        }

        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(10);
        head.next.next.next = new Node(40);

        System.out.println("Frequency of the key : "+count(head,10));
    }
}
