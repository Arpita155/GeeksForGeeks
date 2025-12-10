package GeeksForGeeks.LinkedList.Basic;

public class InsertAtEndOfLL {

    int data;
    InsertAtEndOfLL next;

    InsertAtEndOfLL(int value){
        this.data=value;
        this.next=null;
    }

    static void traversal(InsertAtEndOfLL head) {
        // --------Recursive Traversal------------
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);
    }

    public static InsertAtEndOfLL insertAtEnd(InsertAtEndOfLL head, int x) {
        // code here

        InsertAtEndOfLL temp = new InsertAtEndOfLL(x);
        if(head == null){
            head=temp;
            return head;
        }
        InsertAtEndOfLL curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next=temp;


        return head;
    }

    public static void main(String[] args) {
        InsertAtEndOfLL head = new InsertAtEndOfLL(10);
        head.next=new InsertAtEndOfLL(20);
        head.next.next=new InsertAtEndOfLL(30);

        head=insertAtEnd(head,50);
        traversal(head);    // 10 20 30 50
    }
}
