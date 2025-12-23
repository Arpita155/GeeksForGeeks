package GeeksForGeeks.LinkedList.Basic;

public class ModularNode {

    public static int modularNode(Node head, int k) {
        // Code here//Position this line where user code will be pasted.

        Node curr = head;
        int c1=0;
        while(curr!=null){
            c1++;
            curr=curr.next;
        }
        if(k>c1){
            return -1;
        }
        curr=head;
        int c=0;
        int ans = 0;
        while(curr!=null){
            c++;
            if(c%k==0){
                ans = curr.data;
            }
            curr=curr.next;
        }

        return ans;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("LL looks like this : ");
        Node.traversal(head);

        System.out.print("Modular node is : "+modularNode(head,4));

    }
}
