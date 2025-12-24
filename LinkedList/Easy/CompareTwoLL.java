package GeeksForGeeks.LinkedList.Easy;

//Q.  Given two strings, head1 and head2, represented as linked lists where each character is stored in a node's data field, complete the function compare() that mimics the behavior of strcmp(). Specifically, the function should return:
//
//0 if both strings are identical,
//1 if the first linked list is lexicographically greater, and
//-1 if the second linked list is lexicographically greater.

public class CompareTwoLL {

    char data;
    CompareTwoLL next;

    CompareTwoLL(char value){
        this.data=value;
        this.next=null;
    }

    static void traversal(CompareTwoLL head) {

        // -----------Iterative Traversal--------
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }

        CompareTwoLL curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static int compare(CompareTwoLL head1, CompareTwoLL head2) {
        // Your code here

        CompareTwoLL a = head1;
        CompareTwoLL b = head2;
        while(a!=null && b!=null){
            if(a.data > b.data){
                return 1;
            }else if(b.data > a.data){
                return -1;
            }
            a=a.next;
            b=b.next;
        }
        if(a==null && b==null)
            return 0;   // both strings are identical

        if(a==null) {
            return -1;   // the second linked list is lexicographically greater.
        }

        return 1;   // first linked list is lexicographically greater,
    }

    public static void main(String[] args) {
        CompareTwoLL head1 = new CompareTwoLL('a');
        head1.next = new CompareTwoLL('b');
        head1.next.next = new CompareTwoLL('a');
        head1.next.next.next = new CompareTwoLL('b');
        head1.next.next.next.next = new CompareTwoLL('a');

        CompareTwoLL head2 = new CompareTwoLL('a');
        head2.next = new CompareTwoLL('b');
        head2.next.next = new CompareTwoLL('a');
        head2.next.next.next = new CompareTwoLL('a');

        System.out.print("LL1 looks like this : ");
        CompareTwoLL.traversal(head1);
        System.out.print("\nLL2 looks like this : ");
        CompareTwoLL.traversal(head2);

        System.out.println("\nAfter comparison the result is : "+compare(head1,head2));
    }
}
