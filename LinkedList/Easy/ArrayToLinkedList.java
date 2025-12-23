package GeeksForGeeks.LinkedList.Easy;

public class ArrayToLinkedList {

    public static Node arrayToList(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        int n = arr.length-1;
        Node curr = head;
        int i=1;
        while(n>0){
            curr.next=new Node(arr[i]);
            curr=curr.next;
            i++;
            n--;
        }

        return head;
    }

    public static void main(String[] args) {

        int []arr = {1,2,3,4,5};

        Node head = arrayToList(arr);
        System.out.print("LL looks like this : ");
        Node.traversal(head);
    }
}
